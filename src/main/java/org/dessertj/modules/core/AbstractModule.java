package org.dessertj.modules.core;

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
import org.dessertj.slicing.AbstractDelegateSlice;
import org.dessertj.slicing.Slice;

/**
 * Common parent for all sorts of module slice implementations.
 */
public abstract class AbstractModule extends AbstractDelegateSlice implements ModuleSlice {

    @Override
    protected Slice getDelegate() {
        return getUnqualifiedExports();
    }

    @Override
    public Slice getInternals() {
        return getImplementation().minus(this);
    }
}