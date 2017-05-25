package com.rdemir.assigment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class AssigmentApplication implements CommandLineRunner{

	public static void main(String[] args)	 {
		SpringApplication.run(AssigmentApplication.class, args);
	}

    @Scheduled(fixedRate = 5000)
    public void run(String... strings) throws Exception {

    }
}
