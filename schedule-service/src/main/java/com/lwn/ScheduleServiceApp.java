package com.lwn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = "com.lwn.model.mapper")
@EnableAsync
@EnableScheduling
public class ScheduleServiceApp {
    public static void main(String[] args) {

        SpringApplication.run(ScheduleServiceApp.class, args);
    }
}