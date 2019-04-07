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

import com.google.common.base.Supplier;

import com.metaring.framework.Core;
import com.metaring.framework.SysKB;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.util.Crypto;

final class InternalCrypto {

    private static final String CFG_CRYPTO = "crypto";
    private static final String CFG_MAX_KEY_LENGTH = "maxKeyLength";
    private static final String CFG_ALGORITHM = "algorythm";
    private static final String CFG_KEY_TYPE = "keyType";
    private static final String CFG_KEY = "key";

    static final Crypto INSTANCE = (new Supplier<Crypto>() {
        @Override
        public Crypto get() {
            SysKB sysKB = Core.SYSKB;
            if (sysKB == null) {
                return null;
            }
            if (!sysKB.hasProperties(SensitiveDataQueryResolverManager.CFG_SENSITIVE_DATA_PERSISTENCE)) {
                return null;
            }
            DataRepresentation dataRepresentation = sysKB.get(SensitiveDataQueryResolverManager.CFG_SENSITIVE_DATA_PERSISTENCE);
            if (!dataRepresentation.hasProperties(CFG_CRYPTO)) {
                return null;
            }
            dataRepresentation = dataRepresentation.get(CFG_CRYPTO);
            return new Crypto(dataRepresentation.getText(CFG_ALGORITHM), dataRepresentation.getText(CFG_KEY), dataRepresentation.getText(CFG_KEY_TYPE), dataRepresentation.getDigit(CFG_MAX_KEY_LENGTH).intValue());
       }
    }).get();
}
