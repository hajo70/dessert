/**
 * Analyzes .class files to determine dependencies.
 * The implementation is based on the
 * <a href="https://docs.oracle.com/javase/specs/jvms/se18/html/jvms-4.html" target="_blank">
 * Java Virtual Machine Specification</a> for Java SE 18.
 */
package de.spricom.dessert.classfile;
/*-
 * #%L
 * Dessert Dependency Assertion Library for Java
 * %%
 * Copyright (C) 2017 - 2022 Hans Jörg Heßmann
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
