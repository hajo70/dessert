package de.spricom.dessert.modules.java;

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

class XmlModule extends FixedModule {

    XmlModule(Classpath cp) {
        super("java.xml", "17",
                Slices.of(
                        cp.slice("javax.xml.*"),
                        cp.slice("javax.xml.catalog.*"),
                        cp.slice("javax.xml.datatype.*"),
                        cp.slice("javax.xml.namespace.*"),
                        cp.slice("javax.xml.parsers.*"),
                        cp.slice("javax.xml.stream.*"),
                        cp.slice("javax.xml.stream.events.*"),
                        cp.slice("javax.xml.stream.util.*"),
                        cp.slice("javax.xml.transform.*"),
                        cp.slice("javax.xml.transform.dom.*"),
                        cp.slice("javax.xml.transform.sax.*"),
                        cp.slice("javax.xml.transform.stax.*"),
                        cp.slice("javax.xml.transform.stream.*"),
                        cp.slice("javax.xml.validation.*"),
                        cp.slice("javax.xml.xpath.*"),
                        cp.slice("org.w3c.dom.*"),
                        cp.slice("org.w3c.dom.bootstrap.*"),
                        cp.slice("org.w3c.dom.events.*"),
                        cp.slice("org.w3c.dom.ls.*"),
                        cp.slice("org.w3c.dom.ranges.*"),
                        cp.slice("org.w3c.dom.traversal.*"),
                        cp.slice("org.w3c.dom.views.*"),
                        cp.slice("org.xml.sax.*"),
                        cp.slice("org.xml.sax.ext.*"),
                        cp.slice("org.xml.sax.helpers.*")
                ),
                Slices.of(
                        cp.slice("com.sun.java_cup.internal.runtime.*"),
                        cp.slice("com.sun.org.apache.bcel.internal.*"),
                        cp.slice("com.sun.org.apache.bcel.internal.classfile.*"),
                        cp.slice("com.sun.org.apache.bcel.internal.generic.*"),
                        cp.slice("com.sun.org.apache.bcel.internal.util.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.extensions.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.lib.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.res.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.templates.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.utils.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.xsltc.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.xsltc.compiler.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.xsltc.compiler.util.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.xsltc.dom.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.xsltc.runtime.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.xsltc.runtime.output.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.xsltc.trax.*"),
                        cp.slice("com.sun.org.apache.xalan.internal.xsltc.util.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.dom.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.dom.events.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.dtd.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.dtd.models.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.dv.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.dv.dtd.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.dv.util.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.dv.xs.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.io.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.msg.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.validation.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.xpath.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.xpath.regex.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.xs.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.xs.identity.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.xs.models.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.xs.opti.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.xs.traversers.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.impl.xs.util.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.jaxp.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.jaxp.datatype.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.jaxp.validation.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.parsers.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.util.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.utils.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.xinclude.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.xni.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.xni.grammars.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.xni.parser.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.xpointer.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.xs.*"),
                        cp.slice("com.sun.org.apache.xerces.internal.xs.datatypes.*"),
                        cp.slice("com.sun.org.apache.xml.internal.dtm.*"),
                        cp.slice("com.sun.org.apache.xml.internal.dtm.ref.*"),
                        cp.slice("com.sun.org.apache.xml.internal.dtm.ref.dom2dtm.*"),
                        cp.slice("com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.*"),
                        cp.slice("com.sun.org.apache.xml.internal.res.*"),
                        cp.slice("com.sun.org.apache.xml.internal.serialize.*"),
                        cp.slice("com.sun.org.apache.xml.internal.serializer.*"),
                        cp.slice("com.sun.org.apache.xml.internal.serializer.dom3.*"),
                        cp.slice("com.sun.org.apache.xml.internal.serializer.utils.*"),
                        cp.slice("com.sun.org.apache.xml.internal.utils.*"),
                        cp.slice("com.sun.org.apache.xml.internal.utils.res.*"),
                        cp.slice("com.sun.org.apache.xpath.internal.*"),
                        cp.slice("com.sun.org.apache.xpath.internal.axes.*"),
                        cp.slice("com.sun.org.apache.xpath.internal.compiler.*"),
                        cp.slice("com.sun.org.apache.xpath.internal.functions.*"),
                        cp.slice("com.sun.org.apache.xpath.internal.jaxp.*"),
                        cp.slice("com.sun.org.apache.xpath.internal.objects.*"),
                        cp.slice("com.sun.org.apache.xpath.internal.operations.*"),
                        cp.slice("com.sun.org.apache.xpath.internal.patterns.*"),
                        cp.slice("com.sun.org.apache.xpath.internal.res.*"),
                        cp.slice("com.sun.xml.internal.stream.*"),
                        cp.slice("com.sun.xml.internal.stream.dtd.*"),
                        cp.slice("com.sun.xml.internal.stream.dtd.nonvalidating.*"),
                        cp.slice("com.sun.xml.internal.stream.events.*"),
                        cp.slice("com.sun.xml.internal.stream.util.*"),
                        cp.slice("com.sun.xml.internal.stream.writers.*"),
                        cp.slice("javax.xml.*"),
                        cp.slice("javax.xml.catalog.*"),
                        cp.slice("javax.xml.datatype.*"),
                        cp.slice("javax.xml.namespace.*"),
                        cp.slice("javax.xml.parsers.*"),
                        cp.slice("javax.xml.stream.*"),
                        cp.slice("javax.xml.stream.events.*"),
                        cp.slice("javax.xml.stream.util.*"),
                        cp.slice("javax.xml.transform.*"),
                        cp.slice("javax.xml.transform.dom.*"),
                        cp.slice("javax.xml.transform.sax.*"),
                        cp.slice("javax.xml.transform.stax.*"),
                        cp.slice("javax.xml.transform.stream.*"),
                        cp.slice("javax.xml.validation.*"),
                        cp.slice("javax.xml.xpath.*"),
                        cp.slice("jdk.xml.internal.*"),
                        cp.slice("org.w3c.dom.*"),
                        cp.slice("org.w3c.dom.bootstrap.*"),
                        cp.slice("org.w3c.dom.events.*"),
                        cp.slice("org.w3c.dom.ls.*"),
                        cp.slice("org.w3c.dom.ranges.*"),
                        cp.slice("org.w3c.dom.traversal.*"),
                        cp.slice("org.w3c.dom.views.*"),
                        cp.slice("org.xml.sax.*"),
                        cp.slice("org.xml.sax.ext.*"),
                        cp.slice("org.xml.sax.helpers.*")
                ));
    }
}
