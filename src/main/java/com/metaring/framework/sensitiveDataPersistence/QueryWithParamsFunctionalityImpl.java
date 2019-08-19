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

import java.util.concurrent.CompletableFuture;

import com.ea.async.Async;
import com.metaring.framework.persistence.PersistenceFunctionalitiesManager;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.type.series.TextSeries;

class QueryWithParamsFunctionalityImpl extends QueryWithParamsFunctionality {

    @Override
    protected CompletableFuture<Void> preConditionCheck(ParametrizedSensitiveQuery input) throws Exception {
        return end;
    }

    @Override
    protected CompletableFuture<DataRepresentation> call(ParametrizedSensitiveQuery input) throws Exception {
        TextSeries params = SensitiveDataQueryResolverManager.getParams(input.getParams());
        String encQuery = Async.await(SensitiveDataQueryResolverManager.INSTANCE.resolve(input.getQuery(), params, InternalCrypto.INSTANCE::encrypt));
        DataRepresentation result = Async.await(PersistenceFunctionalitiesManager.query(encQuery));
        return end(SensitiveDataRepresentationTransformer.transform(result, params, InternalCrypto.INSTANCE::decrypt));
    }

    @Override
    protected CompletableFuture<Void> postConditionCheck(ParametrizedSensitiveQuery input, DataRepresentation output) throws Exception {
        return end;
    }
}