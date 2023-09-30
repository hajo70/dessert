package org.dessertj.classfile.attribute;

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

import org.dessertj.classfile.constpool.ConstantPool;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/**
 * Represents a
 * <a href="https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html#jvms-4.7.31" target="_blank">
 * Java Virtual Machine Specification: 4.7.31. The PermittedSubclasses Attribute</a>.
 */
public class PermittedSubclassesAttribute extends AttributeInfo {

    private final String[] classes;

    public PermittedSubclassesAttribute(String name, DataInputStream is, ConstantPool constantPool) throws IOException {
        super(name);
        skipLength(is);
        classes = readClassNames(name, is, constantPool);
    }

    public String[] getClasses() {
        return classes;
    }

    public void addDependentClassNames(Set<String> classNames) {
        Collections.addAll(classNames, classes);
    }

    @Override
    public String toString() {
        return getName() + ": " + Arrays.toString(classes);
    }
}