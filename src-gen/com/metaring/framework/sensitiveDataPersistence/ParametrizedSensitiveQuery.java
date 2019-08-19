package com.metaring.framework.sensitiveDataPersistence;

import com.metaring.framework.type.series.TextSeries;
import com.metaring.framework.Tools;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.GeneratedCoreType;

public class ParametrizedSensitiveQuery implements GeneratedCoreType {

    public static final String FULLY_QUALIFIED_NAME = "com.metaring.framework.sensitiveDataPersistence.parametrizedSensitiveQuery";

    private String query;
    private TextSeries params;

    private ParametrizedSensitiveQuery(String query, TextSeries params) {
        this.query = query;
        this.params = params;
    }

    public String getQuery() {
        return this.query;
    }

    public TextSeries getParams() {
        return this.params;
    }

    public static ParametrizedSensitiveQuery create(String query, TextSeries params) {
        return new ParametrizedSensitiveQuery(query, params);
    }

    public static ParametrizedSensitiveQuery fromJson(String jsonString) {

        if(jsonString == null) {
            return null;
        }

        jsonString = jsonString.trim();
        if(jsonString.isEmpty()) {
            return null;
        }

        if(jsonString.equalsIgnoreCase("null")) {
            return null;
        }

        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.fromJson(jsonString);

        String query = null;
        if(dataRepresentation.hasProperty("query")) {
            try {
                query = dataRepresentation.getText("query");
            } catch (Exception e) {
            }
        }

        TextSeries params = null;
        if(dataRepresentation.hasProperty("params")) {
            try {
                params = dataRepresentation.getTextSeries("params");
            } catch (Exception e) {
            }
        }

        ParametrizedSensitiveQuery parametrizedSensitiveQuery = create(query, params);
        return parametrizedSensitiveQuery;
    }

    public static ParametrizedSensitiveQuery fromObject(Object object) {

        if(object == null) {
            return null;
        }

        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.fromObject(object);

        String query = null;
        if(dataRepresentation.hasProperty("query")) {
            try {
                query = dataRepresentation.getText("query");
            } catch (Exception e) {
            }
        }

        TextSeries params = null;
        if(dataRepresentation.hasProperty("params")) {
            try {
                params = dataRepresentation.getTextSeries("params");
            } catch (Exception e) {
            }
        }

        ParametrizedSensitiveQuery parametrizedSensitiveQuery = create(query, params);
        return parametrizedSensitiveQuery;
    }

    public DataRepresentation toDataRepresentation() {
        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.create();
        if (query != null) {
            dataRepresentation.add("query", query);
        }

        if (params != null) {
            dataRepresentation.add("params", params.toArray());
        }

        return dataRepresentation;
    }

    @Override
    public String toJson() {
        return toDataRepresentation().toJson();
    }

    @Override
    public String toString() {
        return this.toJson();
    }
}