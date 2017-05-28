package com.rdemir.assigment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceIdModel {

    private String type;
    private Value value;

    public ServiceIdModel() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "ServiceIdModel{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
