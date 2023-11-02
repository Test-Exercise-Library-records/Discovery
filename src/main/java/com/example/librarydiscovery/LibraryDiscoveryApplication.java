package com.example.librarydiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LibraryDiscoveryApplication {

  public static void main(String[] args) {
    SpringApplication.run(LibraryDiscoveryApplication.class, args);
  }

}
