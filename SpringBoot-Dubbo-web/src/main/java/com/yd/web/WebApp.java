package com.yd.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:application-dubbo-consume.xml")
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class WebApp {

	public static void main(String[] args){
        SpringApplication.run(WebApp.class, args);
        System.out.println("WEB start ...");
    }
}
