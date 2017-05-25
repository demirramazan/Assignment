package com.rdemir.assigment.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GeoIP", namespace = "http://www.webservicex.net/")
public class GeoIPWSModel {

    private Integer returnCode;
    private String ip;
    private String returnCodeDetails;
    private String countryName;
    private String countryCode;


    @XmlElement(name = "ReturnCode", namespace = "http://www.webservicex.net/")
    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    @XmlElement(name = "IP", namespace = "http://www.webservicex.net/")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @XmlElement(name = "ReturnCodeDetails", namespace = "http://www.webservicex.net/")
    public String getReturnCodeDetails() {
        return returnCodeDetails;
    }

    public void setReturnCodeDetails(String returnCodeDetails) {
        this.returnCodeDetails = returnCodeDetails;
    }

    @XmlElement(name = "CountryName", namespace = "http://www.webservicex.net/")
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @XmlElement(name = "CountryCode", namespace = "http://www.webservicex.net/")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}
