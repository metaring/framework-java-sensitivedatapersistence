/**
 *    Copyright 2019 MetaRing s.r.l.
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.metaring.framework.sensitiveDataPersistence;

import java.util.function.Function;

import com.metaring.framework.Tools;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.type.series.TextSeries;

final class SensitiveDataRepresentationTransformer {

    static final DataRepresentation transform(DataRepresentation inputData, TextSeries params, Function<String, String> inputFunction) {
        return transform(inputData, params != null ? params : Tools.FACTORY_TEXT_SERIES.create(), inputFunction, params == null || params.isEmpty());
    }

    private static final  DataRepresentation transform(DataRepresentation inputData, TextSeries params, Function<String, String> inputFunction, boolean force) {
        if(inputData.hasLength()) {
            int length = inputData.length();
            for (int i=0; i<length; i++) {
                inputData.set(i, transform(inputData.get(i), params, inputFunction, force));
            }
            return inputData;
        }
        if (inputData.hasProperties()) {
            for (String property : inputData.getProperties()) {
                inputData.add(property, transform(inputData.get(property), params, inputFunction, params.contains(property) || force));
            }
            return inputData;
        }
        if (force && inputData.isText()) {
            return Tools.FACTORY_DATA_REPRESENTATION.fromObject(inputFunction.apply(inputData.asText()));
        }
        return inputData;
    }
}