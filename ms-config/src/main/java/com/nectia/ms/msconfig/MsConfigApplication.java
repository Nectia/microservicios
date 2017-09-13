package com.nectia.ms.msconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableConfigServer
public class MsConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConfigApplication.class, args);
    }
}
