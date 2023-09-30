package org.dessertj.matching;

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

/**
 * Matches the ".." package wildcard.
 */
class WildcardShortNameMatcher extends AbstractShortNameMatcher {

    public WildcardShortNameMatcher(ShortNameMatcher[] shortNameMatchers, int index) {
        super(shortNameMatchers, index);
    }

    @Override
    public ShortNameMatcher match(String shortName) {
        if (next().match(shortName).isMatchPossible()) {
            return next().next();
        }
        return this;
    }

    @Override
    public boolean isWildcard() {
        return true;
    }

    public String toString() {
        return "..";
    }
}