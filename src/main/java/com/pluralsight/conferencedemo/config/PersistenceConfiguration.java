package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() throws SQLException {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app?user=postgres&password=Welcome");

        System.out.println("My custom datasource bean has been initialized and set");

        return builder.build();

    }

}