package com.britos.spring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@org.springframework.context.annotation.Configuration
public class Configuration {

    /*
    @Value("${h2.driver}")
    private String driver;
    @Value("${h2.url}")
    private String url;
    @Value("${h2.username}")
    private String username;
    @Value("${h2.password}")
    private String password;
    */

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:test");
        dataSourceBuilder.username("SA");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }

    /*
    MySQLServer("org.hibernate.dialect.MySQL5Dialect",
                        "com.mysql.jdbc.Driver"
                        ,"jdbc:mysql://localhost/basePrueba"
                        ,"root"
                        ,"root"
                        ,"false"
                        ,"create-drop"
    );
    */

}
