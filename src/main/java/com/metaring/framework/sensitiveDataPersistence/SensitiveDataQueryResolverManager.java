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

import java.util.Arrays;

import com.metaring.framework.Core;
import com.metaring.framework.SysKB;
import com.metaring.framework.Tools;

import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.type.series.TextSeries;

@SuppressWarnings("unchecked")
class SensitiveDataQueryResolverManager {
    static final String CFG_SENSITIVE_DATA_PERSISTENCE = "sensitivedatapersistence";
    static final String CFG_QUERY_RESOLVER = "queryResolver";
    static final String CFG_PARAMS = "paramsToTrasform";

    static final SensitiveDataQueryResolver INSTANCE;
    static final TextSeries PARAMS = Tools.FACTORY_TEXT_SERIES.create();

    static {
        SysKB sysKB = Core.SYSKB;
        if (sysKB ==  null) {
            INSTANCE = null;
        }
        else {
            if (!sysKB.hasProperties(CFG_SENSITIVE_DATA_PERSISTENCE)) {
                INSTANCE = null;
            }
            else {
                DataRepresentation functionalityDataRepresentation = sysKB.get(CFG_SENSITIVE_DATA_PERSISTENCE);
                if (!functionalityDataRepresentation.hasProperty(CFG_QUERY_RESOLVER)) {
                    INSTANCE = null;
                }
                else {
                    String className = functionalityDataRepresentation.getText(CFG_QUERY_RESOLVER);
                    Class<? extends SensitiveDataQueryResolver> clazz = null;
                    try {
                        clazz = (Class<? extends SensitiveDataQueryResolver>) Class.forName(className);
                        INSTANCE = clazz.newInstance();
                    }
                    catch (Exception e) {
                        throw new IllegalArgumentException("An error occurred while creating Sensitive Data Query Resolver class " + className);
                    }
                }
                if (functionalityDataRepresentation.hasProperty(CFG_PARAMS)) {
                    PARAMS.addAll(functionalityDataRepresentation.getTextSeries(CFG_PARAMS));
                }
            }
        }
    }

    static final TextSeries getParams(Iterable<String> inputParams) {
        TextSeries ts = Tools.FACTORY_TEXT_SERIES.create(PARAMS);
        if (inputParams == null) {
            return ts;
        }
        for (String s : inputParams) {
            if (s != null && !s.trim().isEmpty()) {
                ts.add(s);
            }
        }
        return Tools.FACTORY_TEXT_SERIES.create(ts.asEnumerable().distinct().toList());
    }

    static final TextSeries getParams(String... params) {
        return getParams(params == null ? null : Arrays.asList(params));
    }
}