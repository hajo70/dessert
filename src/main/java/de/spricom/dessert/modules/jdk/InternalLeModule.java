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

class InternalLeModule extends FixedModule {

    InternalLeModule(Classpath cp) {
        super("jdk.internal.le", "17",
                Slices.of(
                        
                ),
                Slices.of(
                        cp.slice("jdk.internal.org.jline.keymap.*"),
                        cp.slice("jdk.internal.org.jline.reader.*"),
                        cp.slice("jdk.internal.org.jline.reader.impl.*"),
                        cp.slice("jdk.internal.org.jline.reader.impl.completer.*"),
                        cp.slice("jdk.internal.org.jline.reader.impl.history.*"),
                        cp.slice("jdk.internal.org.jline.terminal.*"),
                        cp.slice("jdk.internal.org.jline.terminal.impl.*"),
                        cp.slice("jdk.internal.org.jline.terminal.impl.jna.*"),
                        cp.slice("jdk.internal.org.jline.terminal.impl.jna.win.*"),
                        cp.slice("jdk.internal.org.jline.terminal.spi.*"),
                        cp.slice("jdk.internal.org.jline.utils.*")
                ));
    }
}
