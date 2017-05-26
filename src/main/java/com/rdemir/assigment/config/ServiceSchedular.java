package com.rdemir.assigment.config;

import com.rdemir.assigment.service.GeoIpServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class ServiceSchedular {
    @Autowired
    @Qualifier(value = "geoIpServiceImp")
    GeoIpServiceImp geoIpServiceImp;


    //burada 5 saniyede bir ayağa kalktı
    @Scheduled(fixedRate = 5000)
    public void homepage() {
        geoIpServiceImp.save();
    }

}
