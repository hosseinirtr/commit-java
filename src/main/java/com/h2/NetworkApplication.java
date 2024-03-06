package com.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NetworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(NetworkApplication.class, args);
        System.out.print("Started...\n");
        System.out.print("\n");
    }
}
