package com.rdemir.assigment.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ServiceIdSubModel {


    @JsonIgnore
    private Long id;
    private String quote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "ServiceIdSubModel{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
