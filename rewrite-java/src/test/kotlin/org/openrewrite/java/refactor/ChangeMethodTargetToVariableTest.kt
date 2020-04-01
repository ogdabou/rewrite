package org.openrewrite.java.refactor

import org.junit.jupiter.api.Test
import org.openrewrite.java.JavaParser
import org.openrewrite.java.assertRefactored

open class ChangeMethodTargetToVariableTest : JavaParser() {

    @Test
    fun refactorExplicitStaticToVariable() {
        val a = """
            package a;
            public class A {
               public void foo() {}
            }
        """.trimIndent()

        val b = """
            package b;
            public class B {
               public static void foo() {}
            }
        """.trimIndent()

        val c = """
            import a.*;
            import b.B;
            public class C {
               A a;
               public void test() {
                   B.foo();
               }
            }
        """.trimIndent()

        val cu = parse(c, a, b)
        val f = cu.classes[0].findFields("a.A")[0]

        val fixed = cu.refactor().fold(cu.findMethodCalls("b.B foo()")) {
            ChangeMethodTargetToVariable(it, f.vars[0])
        }.fix().fixed

        assertRefactored(fixed, """
            import a.A;
            public class C {
               A a;
               public void test() {
                   a.foo();
               }
            }
        """)
    }

    @Test
    fun refactorStaticImportToVariable() {
        val a = """
            package a;
            public class A {
               public void foo() {}
            }
        """.trimIndent()

        val b = """
            package b;
            public class B {
               public static void foo() {}
            }
        """.trimIndent()

        val c = """
            import a.*;
            import static b.B.*;
            public class C {
               A a;
               public void test() {
                   foo();
               }
            }
        """.trimIndent()

        val cu = parse(c, a, b)

        val f = cu.classes[0].findFields("a.A")[0]
        val fixed = cu.refactor().fold(cu.findMethodCalls("b.B foo()")) {
            ChangeMethodTargetToVariable(it, f.vars[0])
        }.fix().fixed

        assertRefactored(fixed, """
            import a.A;
            public class C {
               A a;
               public void test() {
                   a.foo();
               }
            }
        """)
    }
}
