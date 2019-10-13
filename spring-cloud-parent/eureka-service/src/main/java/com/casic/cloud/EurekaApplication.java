package com.casic.cloud;
/*
 *Created with IntelliJ IDEA
 *User: tangcb
 *Date: 2019/10/13
 *Time: 10:37
 *Description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaApplication.class,args);

    }
}
