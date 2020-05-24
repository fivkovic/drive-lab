package com.drivelab.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DriveLabCoreApplication {

    public static void main(final String[] args) {
        SpringApplication.run(DriveLabCoreApplication.class, args);
    }

}
