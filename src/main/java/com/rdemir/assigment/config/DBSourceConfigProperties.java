package com.rdemir.assigment.config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//@ConfigurationProperties(prefix = "spring.datasource")
public class DBSourceConfigProperties {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
}
