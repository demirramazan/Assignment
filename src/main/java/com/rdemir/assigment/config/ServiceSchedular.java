package com.rdemir.assigment.config;

import com.rdemir.assigment.service.GeoIPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class ServiceSchedular {
    @Autowired
    @Qualifier(value  = "geoIpServiceImp")
    GeoIPService geoServiceImp;


    //burada 5 saniyede bir ayağa kalktı
    @Scheduled(fixedRate = 1000 * 5)
    public void homepage(){
        geoServiceImp.save();
    }

}
