package com.rdemir.assigment.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class GeoIPServiceRecord implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private int returnCode;
    private String ip;
    private String returnCodeDetails;
    private String countryName;
    private String countryCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getReturnCodeDetails() {
        return returnCodeDetails;
    }

    public void setReturnCodeDetails(String returnCodeDetails) {
        this.returnCodeDetails = returnCodeDetails;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeoIPServiceRecord)) return false;

        GeoIPServiceRecord that = (GeoIPServiceRecord) o;

        if (returnCode != that.returnCode) return false;
        if (!ip.equals(that.ip)) return false;
        if (returnCodeDetails != null ? !returnCodeDetails.equals(that.returnCodeDetails) : that.returnCodeDetails != null)
            return false;
        if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;
        return countryCode != null ? countryCode.equals(that.countryCode) : that.countryCode == null;
    }

    @Override
    public int hashCode() {
        int result = returnCode;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (returnCodeDetails != null ? returnCodeDetails.hashCode() : 0);
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        return result;
    }
}
