package com.jalinyiel.coursystem.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.jalinyiel.coursystem.system.repository"})
public class SystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(SystemApplication.class, args);
    }

}
