package com.rdemir.assigment.client;

import com.rdemir.assigment.model.ServiceIdModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ramazan on 25.05.2017.
 */
public class ServiceIdWSClient {
    @Autowired
    private RestTemplate restTemplate;

    public ServiceIdModel getIdFromService() {

        ServiceIdModel serviceIdModel = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", ServiceIdModel.class);

        return serviceIdModel;

    }


}
