package com.rdemir.assigment.config;

import org.springframework.stereotype.Component;

@Component
public class HibernateConfigProperties {

    private String databasePlatform;
    private String showSql;

    public HibernateConfigProperties(String databasePlatform, String showSql) {
        this.databasePlatform = databasePlatform;
        this.showSql = showSql;
    }

    public String getDatabasePlatform() {
        return databasePlatform;
    }

    public void setDatabasePlatform(String databasePlatform) {
        this.databasePlatform = databasePlatform;
    }

    public String getShowSql() {
        return showSql;
    }

    public void setShowSql(String showSql) {
        this.showSql = showSql;
    }
}
