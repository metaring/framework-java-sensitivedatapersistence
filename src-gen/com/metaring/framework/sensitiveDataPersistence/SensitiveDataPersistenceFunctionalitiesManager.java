package com.metaring.framework.sensitiveDataPersistence;

import com.metaring.framework.functionality.FunctionalityInfo;
import com.metaring.framework.functionality.FunctionalitiesManager;
import com.metaring.framework.functionality.GeneratedFunctionalitiesManager;
import com.metaring.framework.functionality.Functionality;
import java.util.concurrent.CompletableFuture;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.sensitiveDataPersistence.SensitiveDataInfo;
import java.lang.String;
import com.metaring.framework.sensitiveDataPersistence.ParametrizedSensitiveQuery;
import com.metaring.framework.persistence.OperationResult;

public class SensitiveDataPersistenceFunctionalitiesManager extends FunctionalitiesManager implements GeneratedFunctionalitiesManager {

    public static final FunctionalityInfo LIGHT_UP = FunctionalityInfo.create("com.metaring.framework.sensitiveDataPersistence.lightUp", true, false, false, "com.metaring.framework.type.DataRepresentation", "com.metaring.framework.type.DataRepresentation");

    public static final FunctionalityInfo LIGHT_UP_WITH_PARAMS = FunctionalityInfo.create("com.metaring.framework.sensitiveDataPersistence.lightUpWithParams", true, false, false, "com.metaring.framework.sensitiveDataPersistence.SensitiveDataInfo", "com.metaring.framework.type.DataRepresentation");

    public static final FunctionalityInfo QUERY = FunctionalityInfo.create("com.metaring.framework.sensitiveDataPersistence.query", true, false, false, "java.lang.String", "com.metaring.framework.type.DataRepresentation");

    public static final FunctionalityInfo QUERY_WITH_PARAMS = FunctionalityInfo.create("com.metaring.framework.sensitiveDataPersistence.queryWithParams", true, false, false, "com.metaring.framework.sensitiveDataPersistence.ParametrizedSensitiveQuery", "com.metaring.framework.type.DataRepresentation");

    public static final FunctionalityInfo TARNISH = FunctionalityInfo.create("com.metaring.framework.sensitiveDataPersistence.tarnish", true, false, false, "com.metaring.framework.type.DataRepresentation", "com.metaring.framework.type.DataRepresentation");

    public static final FunctionalityInfo TARNISH_WITH_PARAMS = FunctionalityInfo.create("com.metaring.framework.sensitiveDataPersistence.tarnishWithParams", true, false, false, "com.metaring.framework.sensitiveDataPersistence.SensitiveDataInfo", "com.metaring.framework.type.DataRepresentation");

    public static final FunctionalityInfo UPDATE = FunctionalityInfo.create("com.metaring.framework.sensitiveDataPersistence.update", true, false, false, "java.lang.String", "com.metaring.framework.persistence.OperationResult");

    public static final FunctionalityInfo UPDATE_WITH_PARAMS = FunctionalityInfo.create("com.metaring.framework.sensitiveDataPersistence.updateWithParams", true, false, false, "com.metaring.framework.sensitiveDataPersistence.ParametrizedSensitiveQuery", "com.metaring.framework.persistence.OperationResult");

    public static final CompletableFuture<DataRepresentation> lightUp(DataRepresentation dataRepresentation) {
        return call(LIGHT_UP, LightUpFunctionality.class, getCallingFunctionality(), dataRepresentation, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> lightUp(Functionality functionality, DataRepresentation dataRepresentation) {
        return call(LIGHT_UP, LightUpFunctionality.class, functionality, dataRepresentation, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> lightUpFromJson(String dataRepresentationJson) {
        return callFromJson(LIGHT_UP, LightUpFunctionality.class, getCallingFunctionality(), dataRepresentationJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> lightUpFromJson(Functionality callingFunctionality, String dataRepresentationJson) {
        return callFromJson(LIGHT_UP, LightUpFunctionality.class, callingFunctionality, dataRepresentationJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> lightUpWithParams(SensitiveDataInfo sensitiveDataInfo) {
        return call(LIGHT_UP_WITH_PARAMS, LightUpWithParamsFunctionality.class, getCallingFunctionality(), sensitiveDataInfo, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> lightUpWithParams(Functionality functionality, SensitiveDataInfo sensitiveDataInfo) {
        return call(LIGHT_UP_WITH_PARAMS, LightUpWithParamsFunctionality.class, functionality, sensitiveDataInfo, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> lightUpWithParamsFromJson(String sensitiveDataInfoJson) {
        return callFromJson(LIGHT_UP_WITH_PARAMS, LightUpWithParamsFunctionality.class, getCallingFunctionality(), sensitiveDataInfoJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> lightUpWithParamsFromJson(Functionality callingFunctionality, String sensitiveDataInfoJson) {
        return callFromJson(LIGHT_UP_WITH_PARAMS, LightUpWithParamsFunctionality.class, callingFunctionality, sensitiveDataInfoJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> query(String string) {
        return call(QUERY, QueryFunctionality.class, getCallingFunctionality(), string, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> query(Functionality functionality, String string) {
        return call(QUERY, QueryFunctionality.class, functionality, string, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> queryFromJson(String stringJson) {
        return callFromJson(QUERY, QueryFunctionality.class, getCallingFunctionality(), stringJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> queryFromJson(Functionality callingFunctionality, String stringJson) {
        return callFromJson(QUERY, QueryFunctionality.class, callingFunctionality, stringJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> queryWithParams(ParametrizedSensitiveQuery parametrizedSensitiveQuery) {
        return call(QUERY_WITH_PARAMS, QueryWithParamsFunctionality.class, getCallingFunctionality(), parametrizedSensitiveQuery, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> queryWithParams(Functionality functionality, ParametrizedSensitiveQuery parametrizedSensitiveQuery) {
        return call(QUERY_WITH_PARAMS, QueryWithParamsFunctionality.class, functionality, parametrizedSensitiveQuery, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> queryWithParamsFromJson(String parametrizedSensitiveQueryJson) {
        return callFromJson(QUERY_WITH_PARAMS, QueryWithParamsFunctionality.class, getCallingFunctionality(), parametrizedSensitiveQueryJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> queryWithParamsFromJson(Functionality callingFunctionality, String parametrizedSensitiveQueryJson) {
        return callFromJson(QUERY_WITH_PARAMS, QueryWithParamsFunctionality.class, callingFunctionality, parametrizedSensitiveQueryJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> tarnish(DataRepresentation dataRepresentation) {
        return call(TARNISH, TarnishFunctionality.class, getCallingFunctionality(), dataRepresentation, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> tarnish(Functionality functionality, DataRepresentation dataRepresentation) {
        return call(TARNISH, TarnishFunctionality.class, functionality, dataRepresentation, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> tarnishFromJson(String dataRepresentationJson) {
        return callFromJson(TARNISH, TarnishFunctionality.class, getCallingFunctionality(), dataRepresentationJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> tarnishFromJson(Functionality callingFunctionality, String dataRepresentationJson) {
        return callFromJson(TARNISH, TarnishFunctionality.class, callingFunctionality, dataRepresentationJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> tarnishWithParams(SensitiveDataInfo sensitiveDataInfo) {
        return call(TARNISH_WITH_PARAMS, TarnishWithParamsFunctionality.class, getCallingFunctionality(), sensitiveDataInfo, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> tarnishWithParams(Functionality functionality, SensitiveDataInfo sensitiveDataInfo) {
        return call(TARNISH_WITH_PARAMS, TarnishWithParamsFunctionality.class, functionality, sensitiveDataInfo, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> tarnishWithParamsFromJson(String sensitiveDataInfoJson) {
        return callFromJson(TARNISH_WITH_PARAMS, TarnishWithParamsFunctionality.class, getCallingFunctionality(), sensitiveDataInfoJson, result -> result);
    }

    public static final CompletableFuture<DataRepresentation> tarnishWithParamsFromJson(Functionality callingFunctionality, String sensitiveDataInfoJson) {
        return callFromJson(TARNISH_WITH_PARAMS, TarnishWithParamsFunctionality.class, callingFunctionality, sensitiveDataInfoJson, result -> result);
    }

    public static final CompletableFuture<OperationResult> update(String string) {
        return call(UPDATE, UpdateFunctionality.class, getCallingFunctionality(), string, result -> result.as(OperationResult.class));
    }

    public static final CompletableFuture<OperationResult> update(Functionality functionality, String string) {
        return call(UPDATE, UpdateFunctionality.class, functionality, string, result -> result.as(OperationResult.class));
    }

    public static final CompletableFuture<OperationResult> updateFromJson(String stringJson) {
        return callFromJson(UPDATE, UpdateFunctionality.class, getCallingFunctionality(), stringJson, result -> result.as(OperationResult.class));
    }

    public static final CompletableFuture<OperationResult> updateFromJson(Functionality callingFunctionality, String stringJson) {
        return callFromJson(UPDATE, UpdateFunctionality.class, callingFunctionality, stringJson, result -> result.as(OperationResult.class));
    }

    public static final CompletableFuture<OperationResult> updateWithParams(ParametrizedSensitiveQuery parametrizedSensitiveQuery) {
        return call(UPDATE_WITH_PARAMS, UpdateWithParamsFunctionality.class, getCallingFunctionality(), parametrizedSensitiveQuery, result -> result.as(OperationResult.class));
    }

    public static final CompletableFuture<OperationResult> updateWithParams(Functionality functionality, ParametrizedSensitiveQuery parametrizedSensitiveQuery) {
        return call(UPDATE_WITH_PARAMS, UpdateWithParamsFunctionality.class, functionality, parametrizedSensitiveQuery, result -> result.as(OperationResult.class));
    }

    public static final CompletableFuture<OperationResult> updateWithParamsFromJson(String parametrizedSensitiveQueryJson) {
        return callFromJson(UPDATE_WITH_PARAMS, UpdateWithParamsFunctionality.class, getCallingFunctionality(), parametrizedSensitiveQueryJson, result -> result.as(OperationResult.class));
    }

    public static final CompletableFuture<OperationResult> updateWithParamsFromJson(Functionality callingFunctionality, String parametrizedSensitiveQueryJson) {
        return callFromJson(UPDATE_WITH_PARAMS, UpdateWithParamsFunctionality.class, callingFunctionality, parametrizedSensitiveQueryJson, result -> result.as(OperationResult.class));
    }

}
