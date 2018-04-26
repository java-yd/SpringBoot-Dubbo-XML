package com.yd.rpc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ImportResource("classpath:application-dubbo-service.xml")
@SpringBootApplication
@ServletComponentScan //配置druid必须加的注解，如果不加，访问页面打不开，filter和servlet、listener之类的需要单独进行注册才能使用，spring boot里面提供了该注解起到注册作用
@MapperScan("com.yd.mapper")    //mapper接口扫描，不写报错，因为该类和mapper接口不在同一个包下，所以要指定
public class RpcApp {
	
	public static void main(String[] args){
        SpringApplication.run(RpcApp.class, args);
        System.out.println("RPC start ...");
    }
}
