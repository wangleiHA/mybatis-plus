package com.wl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wl.mapper")
public class MybaitsPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaitsPlusApplication.class, args);
    }

}
