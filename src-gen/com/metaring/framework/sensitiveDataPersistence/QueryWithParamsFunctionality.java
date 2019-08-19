package com.metaring.framework.sensitiveDataPersistence;

import java.util.concurrent.CompletableFuture;
import com.metaring.framework.functionality.AbstractFunctionality;
import com.metaring.framework.functionality.GeneratedFunctionality;
import com.metaring.framework.functionality.FunctionalityInfo;
import com.metaring.framework.sensitiveDataPersistence.ParametrizedSensitiveQuery;
import com.metaring.framework.type.DataRepresentation;

abstract class QueryWithParamsFunctionality extends AbstractFunctionality implements GeneratedFunctionality {

    static final FunctionalityInfo INFO = FunctionalityInfo.create("com.metaring.framework.sensitiveDataPersistence.queryWithParams", true, false, false, "com.metaring.framework.sensitiveDataPersistence.ParametrizedSensitiveQuery", "com.metaring.framework.type.DataRepresentation");

    static final QueryWithParamsFunctionality INSTANCE = new QueryWithParamsFunctionalityImpl();

    protected QueryWithParamsFunctionality() {
        super(INFO, DataRepresentation.class);
    }

    @Override
    protected final CompletableFuture<Void> beforePreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = beforePreConditionCheck(input == null ? null : (ParametrizedSensitiveQuery) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePreConditionCheck(ParametrizedSensitiveQuery input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> preConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = preConditionCheck(input == null ? null : (ParametrizedSensitiveQuery) input);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> preConditionCheck(ParametrizedSensitiveQuery input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPreConditionCheck(Object input) throws Exception {
        CompletableFuture<Void> response = afterPreConditionCheck(input == null ? null : (ParametrizedSensitiveQuery) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPreConditionCheck(ParametrizedSensitiveQuery input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforeCall(Object input) throws Exception {
        CompletableFuture<Void> response = beforeCall(input == null ? null : (ParametrizedSensitiveQuery) input);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforeCall(ParametrizedSensitiveQuery input) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Object> call(Object input) throws Exception {
        CompletableFuture<DataRepresentation> call = call((ParametrizedSensitiveQuery) input);
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

    protected abstract CompletableFuture<DataRepresentation> call(ParametrizedSensitiveQuery input) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterCall(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterCall(input == null ? null : (ParametrizedSensitiveQuery) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterCall(ParametrizedSensitiveQuery input, DataRepresentation output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> beforePostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = beforePostConditionCheck(input == null ? null : (ParametrizedSensitiveQuery) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> beforePostConditionCheck(ParametrizedSensitiveQuery input, DataRepresentation output) throws Exception {
        return end;
    }

    @Override
    protected final CompletableFuture<Void> postConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = postConditionCheck(input == null ? null : (ParametrizedSensitiveQuery) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected abstract CompletableFuture<Void> postConditionCheck(ParametrizedSensitiveQuery input, DataRepresentation output) throws Exception;

    @Override
    protected final CompletableFuture<Void> afterPostConditionCheck(Object input, Object output) throws Exception {
        CompletableFuture<Void> response = afterPostConditionCheck(input == null ? null : (ParametrizedSensitiveQuery) input, output == null ? null : (DataRepresentation) output);
        return response == null ? end : response;
    }

    protected CompletableFuture<Void> afterPostConditionCheck(ParametrizedSensitiveQuery input, DataRepresentation output) throws Exception {
        return end;
    }

    @Override
    protected final Object getInputFromJsonWork(String inputJson) {
        return ParametrizedSensitiveQuery.fromJson(inputJson);
    }
}