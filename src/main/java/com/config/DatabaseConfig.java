package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("com.repo")
@EnableTransactionManagement
@ComponentScan("com")
public class DatabaseConfig {

    @Autowired
    private Environment env;

    //com.mysql.jdbc.Driver
}
