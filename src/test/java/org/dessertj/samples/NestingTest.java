package org.dessertj.samples;

/*-
 * #%L
 * DessertJ Dependency Assertion Library for Java
 * %%
 * Copyright (C) 2017 - 2023 Hans Jörg Heßmann
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

import org.dessertj.classfile.ClassFile;
import org.dessertj.samples.nesting.Host;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

import static org.fest.assertions.Assertions.assertThat;

/**
 * This test has been generated by TestGeneratorTool.
 */
public class NestingTest {

    @Test
    public void testHost_DefaultClass_1() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$DefaultClass$1.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "org.dessertj.samples.nesting.Host$DefaultClass",
                "java.lang.Integer",
                "java.lang.Object",
                "java.util.Comparator",
                "java.util.List");
    }

    @Test
    public void testHost_DefaultClass() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$DefaultClass.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "org.dessertj.samples.nesting.Host$DefaultClass$1",
                "java.lang.Integer",
                "java.lang.Object",
                "java.util.Collections",
                "java.util.Comparator",
                "java.util.List");
    }

    @Test
    public void testHost_DefaultInterface() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$DefaultInterface.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "java.lang.Object");
    }

    @Test
    public void testHost_DefaultStatic() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$DefaultStatic.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "java.lang.Object");
    }

    @Test
    public void testHost_PrivateClass() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$PrivateClass.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "java.lang.Object");
    }

    @Test
    public void testHost_PrivateInterface() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$PrivateInterface.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "java.lang.Object");
    }

    @Test
    public void testHost_PrivateStatic() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$PrivateStatic.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "java.lang.Object");
    }

    @Test
    public void testHost_ProtectedClass() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$ProtectedClass.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "java.lang.Object");
    }

    @Test
    public void testHost_ProtectedInterface() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$ProtectedInterface.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "java.lang.Object");
    }

    @Test
    public void testHost_ProtectedStatic() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$ProtectedStatic.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "java.lang.Object");
    }

    @Test
    public void testHost_PublicClass() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$PublicClass.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "java.lang.Object");
    }

    @Test
    public void testHost_PublicInterface() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$PublicInterface.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "java.lang.Object");
    }

    @Test
    public void testHost_PublicStatic_NestedDefaultStatic_NestedPrivateStatic() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$PublicStatic$NestedDefaultStatic$NestedPrivateStatic.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "org.dessertj.samples.nesting.Host$PublicStatic",
                "org.dessertj.samples.nesting.Host$PublicStatic$NestedDefaultStatic",
                "java.lang.Object");
    }

    @Test
    public void testHost_PublicStatic_NestedDefaultStatic() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$PublicStatic$NestedDefaultStatic.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "org.dessertj.samples.nesting.Host$PublicStatic",
                "org.dessertj.samples.nesting.Host$PublicStatic$NestedDefaultStatic$NestedPrivateStatic",
                "java.lang.Object");
    }

    @Test
    public void testHost_PublicStatic() throws IOException {
        ClassFile cf = new ClassFile(Host.class.getResourceAsStream("Host$PublicStatic.class"));
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host",
                "org.dessertj.samples.nesting.Host$PublicStatic$NestedDefaultStatic",
                "java.lang.Object");
    }

    @Test
    public void testHost() throws IOException {
        ClassFile cf = new ClassFile(Host.class);
        Set<String> dependentClasses = cf.getDependentClasses();
        assertThat(dependentClasses).containsOnly(
                "org.dessertj.samples.nesting.Host$DefaultClass",
                "org.dessertj.samples.nesting.Host$DefaultInterface",
                "org.dessertj.samples.nesting.Host$DefaultStatic",
                "org.dessertj.samples.nesting.Host$PrivateClass",
                "org.dessertj.samples.nesting.Host$PrivateInterface",
                "org.dessertj.samples.nesting.Host$PrivateStatic",
                "org.dessertj.samples.nesting.Host$ProtectedClass",
                "org.dessertj.samples.nesting.Host$ProtectedInterface",
                "org.dessertj.samples.nesting.Host$ProtectedStatic",
                "org.dessertj.samples.nesting.Host$PublicClass",
                "org.dessertj.samples.nesting.Host$PublicInterface",
                "org.dessertj.samples.nesting.Host$PublicStatic",
                "java.lang.Object",
                "java.lang.String",
                "java.util.Iterator",
                "java.util.Map",
                "java.util.Map$Entry",
                "java.util.Set");
    }

}