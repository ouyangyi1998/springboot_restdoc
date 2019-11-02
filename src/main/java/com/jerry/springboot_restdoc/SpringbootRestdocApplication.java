package com.jerry.springboot_restdoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootRestdocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestdocApplication.class, args);
    }

}
