package com.example.bookinventoryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
public class BookInventoryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookInventoryServerApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String home() {
        return "Eureka Client Book Inventory";
    }
}