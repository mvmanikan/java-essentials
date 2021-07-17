package com.kavinmaha.classesAndObjects;

public enum IphoneModel {
    HUAWEI_8_LITE("Huawei8"),
    HUAWEI_9_Y("Huawei9"),
    HUAWEI_X("HuaweiX");

    private final String modelName;

    IphoneModel(String modelName){
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }
}
