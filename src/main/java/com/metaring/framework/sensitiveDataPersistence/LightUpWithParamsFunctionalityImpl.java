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

import com.metaring.framework.SysKB;
import com.metaring.framework.type.DataRepresentation;

final class LightUpWithParamsFunctionalityImpl extends LightUpWithParamsFunctionality {

    protected LightUpWithParamsFunctionalityImpl(SysKB sysKB) {
        super(sysKB);
    }

    @Override
    protected final CompletableFuture<Void> preConditionCheck(SensitiveDataInfo input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<DataRepresentation> call(SensitiveDataInfo input) throws Exception {
        return end(SensitiveDataRepresentationTransformer.transform(input.getData(), SensitiveDataQueryResolverManager.getParams(input.getParams()), InternalCrypto.INSTANCE::decrypt));
    }

    @Override
    protected final CompletableFuture<Void> postConditionCheck(SensitiveDataInfo input, DataRepresentation output) throws Exception {
        return end;
    }
}