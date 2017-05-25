package com.rdemir.assigment.config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//@ConfigurationProperties(prefix = "spring.jpa")
public class HibernateConfigProperties {
    private String databasePlatform;
    private String showSql;
}
