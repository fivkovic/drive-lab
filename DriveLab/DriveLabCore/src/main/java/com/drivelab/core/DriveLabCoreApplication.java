package com.drivelab.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DriveLabCoreApplication {

    public static void main(final String[] args) {
        SpringApplication.run(DriveLabCoreApplication.class, args);
    }

}
