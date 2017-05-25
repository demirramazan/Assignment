package com.rdemir.assigment.client;

import com.rdemir.assigment.model.GeoIPWSModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;


@Component
public class GeoIPWSClient {

    @Autowired
    private RestTemplate restTemplate;

    public GeoIPWSModel getIpFromService() {
        JAXBContext jaxbContext;
        try {

            ResponseEntity<String> results = restTemplate
                    .getForEntity("http://www.webservicex.net/geoipservice.asmx/GetGeoIP?IPAddress=1.1.1.1", String.class);
            jaxbContext = JAXBContext.newInstance(GeoIPWSModel.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            return (GeoIPWSModel) unmarshaller.unmarshal(new StringReader(results.getBody()));

        } catch (JAXBException e) {

            return null;
        }

    }
}
