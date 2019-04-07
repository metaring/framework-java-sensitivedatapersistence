package com.metaring.framework.sensitiveDataPersistence;

import com.metaring.framework.SysKB;
import java.util.concurrent.CompletableFuture;
import com.metaring.framework.functionality.AbstractFunctionality;
import com.metaring.framework.functionality.GeneratedFunctionality;
import com.metaring.framework.sensitiveDataPersistence.SensitiveDataInfo;
import com.metaring.framework.type.DataRepresentation;

public abstract class LightUpWithParamsFunctionality extends AbstractFunctionality implements GeneratedFunctionality {

    protected LightUpWithParamsFunctionality(SysKB sysKB) {
        super(sysKB, SensitiveDataPersistenceFunctionalitiesManager.LIGHT_UP_WITH_PARAMS, DataRepresentation.class);
    }

    @Override
    protected final CompletableFuture<Void> beforePreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = beforePreConditionCheck(input == null ? null : (SensitiveDataInfo) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePreConditionCheck(SensitiveDataInfo input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> preConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = preConditionCheck(input == null ? null : (SensitiveDataInfo) input);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> preConditionCheck(SensitiveDataInfo input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = afterPreConditionCheck(input == null ? null : (SensitiveDataInfo) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPreConditionCheck(SensitiveDataInfo input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforeCall(Object input) throws Exception {
        CompletableFuture<Void> response = beforeCall(input == null ? null : (SensitiveDataInfo) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforeCall(SensitiveDataInfo input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Object> call(Object input) throws Exception {
        CompletableFuture<DataRepresentation> call = call((SensitiveDataInfo) input);
        if(call == null) {
            return end(null);
        }
        final CompletableFuture<Object> response = new CompletableFuture<>();
        call.whenCompleteAsync((result, error) -> {
            if(error != null) {
                response.completeExceptionally(error);
                return;
            }
            response.complete(result);
        }, EXECUTOR);
        return response;
    }

    protected abstract CompletableFuture<DataRepresentation> call(SensitiveDataInfo input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterCall(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterCall(input == null ? null : (SensitiveDataInfo) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterCall(SensitiveDataInfo input, DataRepresentation output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforePostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = beforePostConditionCheck(input == null ? null : (SensitiveDataInfo) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePostConditionCheck(SensitiveDataInfo input, DataRepresentation output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> postConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = postConditionCheck(input == null ? null : (SensitiveDataInfo) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> postConditionCheck(SensitiveDataInfo input, DataRepresentation output) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterPostConditionCheck(input == null ? null : (SensitiveDataInfo) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPostConditionCheck(SensitiveDataInfo input, DataRepresentation output) throws Exception {
        return end;
    }

    @Override
    protected final Object getInputFromJsonWork(String inputJson) {
        return SensitiveDataInfo.fromJson(inputJson);
    }

    protected static final LightUpWithParamsFunctionality create(SysKB sysKB) {
        return new LightUpWithParamsFunctionalityImpl(sysKB);
    }
}