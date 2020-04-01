package org.openrewrite.java.refactor

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.openrewrite.java.JavaParser
import org.openrewrite.java.assertRefactored
import org.openrewrite.java.tree.Flag
import org.openrewrite.java.tree.J

open class ChangeMethodTargetToStaticTest : JavaParser() {

    @Test
    fun refactorTargetToStatic() {
        val a = """
            package a;
            public class A {
               public void nonStatic() {}
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
            class C {
               public void test() {
                   new A().nonStatic();
               }
            }
        """.trimIndent()

        val cu = parse(c, a, b)
        val targets = cu.findMethodCalls("a.A nonStatic()")
        val fixed = cu.refactor()
                .fold(targets) { ChangeMethodTargetToStatic(it, "b.B") }
                .fold(targets) { ChangeMethodName(it, "foo") }
                .fix().fixed

        assertRefactored(fixed, """
            import b.B;
            
            class C {
               public void test() {
                   B.foo();
               }
            }
        """)

        val refactoredInv = fixed.classes[0].methods[0].body!!.statements[0] as J.MethodInvocation
        assertTrue(refactoredInv.type?.hasFlags(Flag.Static) ?: false)
    }

    @Test
    fun refactorStaticTargetToStatic() {
        val a = """
            package a;
            public class A {
               public static void foo() {}
            }
        """.trimIndent()

        val b = """
            package b;
            public class B {
               public static void foo() {}
            }
        """.trimIndent()

        val c = """
            import static a.A.*;
            class C {
               public void test() {
                   foo();
               }
            }
        """.trimIndent()

        val cu = parse(c, a, b)
        val fixed = cu.refactor()
                .fold(cu.findMethodCalls("a.A foo()")) { ChangeMethodTargetToStatic(it, "b.B") }
                .fix().fixed

        assertRefactored(fixed, """
            import b.B;
            
            class C {
               public void test() {
                   B.foo();
               }
            }
        """)
    }
}
