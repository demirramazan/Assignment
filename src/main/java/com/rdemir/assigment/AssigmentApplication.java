package com.rdemir.assigment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class AssigmentApplication {

	public static void main(String[] args)	 {
		SpringApplication.run(AssigmentApplication.class, args);
	}
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        return builder.build();
//    }
//
//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//            ServiceIdModel quote = restTemplate.getForObject(
//                    "http://gturnquist-quoters.cfapps.io/api/random", ServiceIdModel.class);
//            log.info(quote.toString());
//        };
//    }

}
