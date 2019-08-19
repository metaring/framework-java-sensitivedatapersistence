package com.metaring.framework.sensitiveDataPersistence;

import com.metaring.framework.type.series.TextSeries;
import com.metaring.framework.Tools;
import com.metaring.framework.type.DataRepresentation;
import com.metaring.framework.GeneratedCoreType;

public class SensitiveDataInfo implements GeneratedCoreType {

    public static final String FULLY_QUALIFIED_NAME = "com.metaring.framework.sensitiveDataPersistence.sensitiveDataInfo";

    private DataRepresentation data;
    private TextSeries params;

    private SensitiveDataInfo(DataRepresentation data, TextSeries params) {
        this.data = data;
        this.params = params;
    }

    public DataRepresentation getData() {
        return this.data;
    }

    public TextSeries getParams() {
        return this.params;
    }

    public static SensitiveDataInfo create(DataRepresentation data, TextSeries params) {
        return new SensitiveDataInfo(data, params);
    }

    public static SensitiveDataInfo fromJson(String jsonString) {

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

        DataRepresentation data = null;
        if(dataRepresentation.hasProperty("data")) {
            try {
                data = dataRepresentation.get("data");
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

        SensitiveDataInfo sensitiveDataInfo = create(data, params);
        return sensitiveDataInfo;
    }

    public static SensitiveDataInfo fromObject(Object object) {

        if(object == null) {
            return null;
        }

        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.fromObject(object);

        DataRepresentation data = null;
        if(dataRepresentation.hasProperty("data")) {
            try {
                data = dataRepresentation.get("data");
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

        SensitiveDataInfo sensitiveDataInfo = create(data, params);
        return sensitiveDataInfo;
    }

    public DataRepresentation toDataRepresentation() {
        DataRepresentation dataRepresentation = Tools.FACTORY_DATA_REPRESENTATION.create();
        if (data != null) {
            dataRepresentation.add("data", data);
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