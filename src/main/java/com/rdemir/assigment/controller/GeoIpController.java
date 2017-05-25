package com.rdemir.assigment.controller;

import com.rdemir.assigment.service.GeoIpServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeoIpController {
    @Autowired
    GeoIpServiceImp geoIpService;

    @RequestMapping(value = "/getIp")
    public String getIp() {
        return "";
    }
}
