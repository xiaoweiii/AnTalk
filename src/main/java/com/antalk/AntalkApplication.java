package com.antalk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.antalk.dao")
public class AntalkApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntalkApplication.class, args);
    }

}
