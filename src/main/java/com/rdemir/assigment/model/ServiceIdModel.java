package com.rdemir.assigment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ServiceIdModel {

    private String type;
    private ServiceIdSubModel subModel;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ServiceIdSubModel getSubModel() {
        return subModel;
    }

    public void setSubModel(ServiceIdSubModel subModel) {
        this.subModel = subModel;
    }
    @Override
    public String toString() {
        return "ServiceIdModel{" +
                "type='" + type + '\'' +
                ", subModel=" + subModel +
                '}';
    }
}
