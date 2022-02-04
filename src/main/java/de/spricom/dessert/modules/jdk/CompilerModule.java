package de.spricom.dessert.modules.jdk;

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
import de.spricom.dessert.modules.core.FixedModule;
import de.spricom.dessert.slicing.Classpath;
import de.spricom.dessert.slicing.Slices;

class CompilerModule extends FixedModule {

    CompilerModule(Classpath cp) {
        super("jdk.compiler", "17",
                Slices.of(
                        cp.slice("com.sun.source.doctree.*"),
                        cp.slice("com.sun.source.tree.*"),
                        cp.slice("com.sun.source.util.*"),
                        cp.slice("com.sun.tools.javac.*")
                ),
                Slices.of(
                        cp.slice("com.sun.source.doctree.*"),
                        cp.slice("com.sun.source.tree.*"),
                        cp.slice("com.sun.source.util.*"),
                        cp.slice("com.sun.tools.doclint.*"),
                        cp.slice("com.sun.tools.javac.*"),
                        cp.slice("com.sun.tools.javac.api.*"),
                        cp.slice("com.sun.tools.javac.code.*"),
                        cp.slice("com.sun.tools.javac.comp.*"),
                        cp.slice("com.sun.tools.javac.file.*"),
                        cp.slice("com.sun.tools.javac.jvm.*"),
                        cp.slice("com.sun.tools.javac.launcher.*"),
                        cp.slice("com.sun.tools.javac.main.*"),
                        cp.slice("com.sun.tools.javac.model.*"),
                        cp.slice("com.sun.tools.javac.parser.*"),
                        cp.slice("com.sun.tools.javac.platform.*"),
                        cp.slice("com.sun.tools.javac.processing.*"),
                        cp.slice("com.sun.tools.javac.resources.*"),
                        cp.slice("com.sun.tools.javac.tree.*"),
                        cp.slice("com.sun.tools.javac.util.*"),
                        cp.slice("com.sun.tools.sjavac.*"),
                        cp.slice("com.sun.tools.sjavac.client.*"),
                        cp.slice("com.sun.tools.sjavac.comp.*"),
                        cp.slice("com.sun.tools.sjavac.comp.dependencies.*"),
                        cp.slice("com.sun.tools.sjavac.options.*"),
                        cp.slice("com.sun.tools.sjavac.pubapi.*"),
                        cp.slice("com.sun.tools.sjavac.server.*"),
                        cp.slice("com.sun.tools.sjavac.server.log.*"),
                        cp.slice("jdk.internal.shellsupport.doc.*"),
                        cp.slice("jdk.internal.shellsupport.doc.resources.*"),
                        cp.slice("sun.tools.serialver.*"),
                        cp.slice("sun.tools.serialver.resources.*")
                ));
    }
}
