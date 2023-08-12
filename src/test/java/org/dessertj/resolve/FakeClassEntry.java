package org.dessertj.resolve;

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

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FakeClassEntry extends ClassEntry {

    FakeClassEntry(String classname, ClassPackage pckg) {
        super(classname, pckg);
    }

    @Override
    protected ClassFile resolveClassFile() {
        try {
            return new ClassFile(this.getClass());
        } catch (IOException ex) {
            throw new IllegalStateException("Unable to resolve " + FakeClassEntry.class.getSimpleName(), ex);
        }
    }

    @Override
    public URI getURI() {
        try {
            return new URI("fake:" + getPackage().getRoot().getURI().getPath().replace(File.separatorChar, '/') + "/" + getClassname());
        } catch (URISyntaxException ex) {
            throw new IllegalStateException("Invalid URI for " + getClassname(), ex);
        }
    }
}