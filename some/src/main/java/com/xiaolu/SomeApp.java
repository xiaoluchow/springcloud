package com.xiaolu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SomeApp
{
    @Value("${my.message}")
    private String message;

    @RequestMapping("/getMessage")
    public String getMessage() {
        return message;
    }

    public static void main( String[] args )
    {
        SpringApplication.run(SomeApp.class, args);
    }
}
