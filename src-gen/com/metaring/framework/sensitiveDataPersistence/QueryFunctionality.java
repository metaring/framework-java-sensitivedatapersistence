package com.metaring.framework.sensitiveDataPersistence;

import com.metaring.framework.SysKB;
import java.util.concurrent.CompletableFuture;
import com.metaring.framework.functionality.AbstractFunctionality;
import com.metaring.framework.functionality.GeneratedFunctionality;
import com.metaring.framework.type.DataRepresentation;

public abstract class QueryFunctionality extends AbstractFunctionality implements GeneratedFunctionality {

    protected QueryFunctionality(SysKB sysKB) {
        super(sysKB, SensitiveDataPersistenceFunctionalitiesManager.QUERY, DataRepresentation.class);
    }

    @Override
    protected final CompletableFuture<Void> beforePreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = beforePreConditionCheck(input == null ? null : (String) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePreConditionCheck(String input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> preConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = preConditionCheck(input == null ? null : (String) input);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> preConditionCheck(String input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = afterPreConditionCheck(input == null ? null : (String) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPreConditionCheck(String input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforeCall(Object input) throws Exception {
        CompletableFuture<Void> response = beforeCall(input == null ? null : (String) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforeCall(String input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Object> call(Object input) throws Exception {
        CompletableFuture<DataRepresentation> call = call((String) input);
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

    protected abstract CompletableFuture<DataRepresentation> call(String input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterCall(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterCall(input == null ? null : (String) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterCall(String input, DataRepresentation output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforePostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = beforePostConditionCheck(input == null ? null : (String) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePostConditionCheck(String input, DataRepresentation output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> postConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = postConditionCheck(input == null ? null : (String) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> postConditionCheck(String input, DataRepresentation output) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterPostConditionCheck(input == null ? null : (String) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPostConditionCheck(String input, DataRepresentation output) throws Exception {
        return end;
    }

    @Override
    protected final Object getInputFromJsonWork(String inputJson) {
        return inputJson == null ? null : inputJson.trim().isEmpty() ? null : inputJson.equals("null") ? null : inputJson.substring(1, inputJson.length() - 1);
    }

    protected static final QueryFunctionality create(SysKB sysKB) {
        return new QueryFunctionalityImpl(sysKB);
    }
}