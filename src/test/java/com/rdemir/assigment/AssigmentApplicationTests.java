package com.rdemir.assigment;

import com.rdemir.assigment.model.ServiceIdModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssigmentApplicationTests {
    @Autowired
    RestTemplate restTemplate;

    @Test
    public void contextLoads() {
        ServiceIdModel serviceIdModel =
                restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", ServiceIdModel.class);
        Assert.assertNotNull(serviceIdModel.getValue().getId());
    }

}
