package com.iftm.trabalho04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheRedisApplicationJava {

    public static void main(String[] args) {
        SpringApplication.run(CacheRedisApplicationJava.class, args);
    }

}
