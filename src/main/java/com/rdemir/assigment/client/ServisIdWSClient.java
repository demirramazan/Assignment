package com.rdemir.assigment.client;

import com.rdemir.assigment.model.ServiceIdGeneratorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * Created by ramazan on 25.05.2017.
 */
public class ServisIdWSClient {
    @Autowired
    private RestTemplate restTemplate;

    public ServiceIdGeneratorModel getIdFromService() {

        JAXBContext jaxbContext;
        try {
            ResponseEntity<String> results = restTemplate
                    .getForEntity("http://gturnquist-quoters.cfapps.io/api/random", String.class);
            jaxbContext = JAXBContext.newInstance(ServiceIdGeneratorModel.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            return (ServiceIdGeneratorModel) unmarshaller.unmarshal(new StringReader(results.getBody()));

        } catch (JAXBException e) {

            return null;
        }
    }


}
