package com.yd.rpc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ImportResource("classpath:application-dubbo-service.xml")
@SpringBootApplication
@MapperScan("com.yd.mapper")    //mapper接口扫描，不写报错
public class RpcApp {
	
	public static void main(String[] args){
        SpringApplication.run(RpcApp.class, args);
        System.out.println("RPC start ...");
    }
}
