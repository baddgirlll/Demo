package com.example.demo0720;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo0720.mapper")
public class Demo0720Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo0720Application.class, args);
    }

}



