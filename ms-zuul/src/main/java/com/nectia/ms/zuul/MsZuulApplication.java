package com.nectia.ms.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class MsZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsZuulApplication.class, args);
	}
}
