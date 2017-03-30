package com.xiaolu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryBackupApp
{
    public static void main( String[] args )
    {

        SpringApplication.run(EurekaDiscoveryBackupApp.class, args);
    }
}
