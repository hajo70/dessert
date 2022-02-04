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

class JfrModule extends FixedModule {

    JfrModule(Classpath cp) {
        super("jdk.jfr", "17",
                Slices.of(
                        cp.slice("jdk.jfr.*"),
                        cp.slice("jdk.jfr.consumer.*")
                ),
                Slices.of(
                        cp.slice("jdk.jfr.*"),
                        cp.slice("jdk.jfr.consumer.*"),
                        cp.slice("jdk.jfr.events.*"),
                        cp.slice("jdk.jfr.internal.*"),
                        cp.slice("jdk.jfr.internal.consumer.*"),
                        cp.slice("jdk.jfr.internal.dcmd.*"),
                        cp.slice("jdk.jfr.internal.handlers.*"),
                        cp.slice("jdk.jfr.internal.instrument.*"),
                        cp.slice("jdk.jfr.internal.jfc.*"),
                        cp.slice("jdk.jfr.internal.jfc.model.*"),
                        cp.slice("jdk.jfr.internal.management.*"),
                        cp.slice("jdk.jfr.internal.settings.*"),
                        cp.slice("jdk.jfr.internal.test.*"),
                        cp.slice("jdk.jfr.internal.tool.*"),
                        cp.slice("jdk.jfr.internal.types.*")
                ));
    }
}
