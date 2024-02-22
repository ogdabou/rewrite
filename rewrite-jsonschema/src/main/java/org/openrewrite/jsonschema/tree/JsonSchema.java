/*
 * Copyright 2021 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.jsonschema.tree;

import org.openrewrite.*;
import org.openrewrite.internal.lang.Nullable;
import org.openrewrite.marker.Markers;

import java.util.UUID;

public interface JsonSchema extends Tree {


    @Override
    default String getJacksonPolymorphicTypeTag() {
        return Tree.super.getJacksonPolymorphicTypeTag();
    }

    @Override
    UUID getId();

    @Override
    Markers getMarkers();

    @Override
    <T extends Tree> T withMarkers(Markers markers);

    @Override
    <T extends Tree> T withId(UUID id);

    @Override
    default <R extends Tree, P> @Nullable R accept(TreeVisitor<R, P> v, P p) {
        return Tree.super.accept(v, p);
    }

    @Override
    <P> boolean isAcceptable(TreeVisitor<?, P> v, P p);

    @Override
    default <P> TreeVisitor<?, PrintOutputCapture<P>> printer(Cursor cursor) {
        return Tree.super.printer(cursor);
    }

    @Override
    default String print(Cursor cursor) {
        return Tree.super.print(cursor);
    }

    @Override
    default <P> String print(Cursor cursor, PrintOutputCapture<P> out) {
        return Tree.super.print(cursor, out);
    }

    @Override
    default <P> String print(TreeVisitor<?, PrintOutputCapture<Integer>> printer) {
        return Tree.super.print(printer);
    }

    @Override
    default <P> String printTrimmed(P p, Cursor cursor) {
        return Tree.super.printTrimmed(p, cursor);
    }

    @Override
    default String printTrimmed(Cursor cursor) {
        return Tree.super.printTrimmed(cursor);
    }

    @Override
    default String printTrimmed(TreeVisitor<?, PrintOutputCapture<Integer>> printer) {
        return Tree.super.printTrimmed(printer);
    }

    @Override
    default boolean isScope(@Nullable Tree tree) {
        return Tree.super.isScope(tree);
    }

    @Override
    default <T2 extends Tree> T2 cast() {
        return Tree.super.cast();
    }

    @Override
    default <T2 extends Tree> @Nullable T2 safeCast() {
        return Tree.super.safeCast();
    }
}
