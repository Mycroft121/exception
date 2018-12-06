package com.cc.exception;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configurable
@SpringBootApplication
public class ExceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionApplication.class, args);
    }
}
