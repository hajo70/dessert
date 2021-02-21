package de.spricom.dessert.slicing;

/*-
 * #%L
 * Dessert Dependency Assertion Library
 * %%
 * Copyright (C) 2017 - 2021 Hans Jörg Heßmann
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class DerivedSlicingTest {
    private Classpath cp = new Classpath();

    @Test
    public void test() {
        Slice slice = cp.slice("foo.bar..*");
        assertThat(slice.contains(cp.asClazz("foo.bar.baz.Foo"))).isTrue();
        assertThat(slice.contains(cp.asClazz("foo.boo.baz.Foo"))).isFalse();
    }
}