
package com.xulb.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class EamConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EamConfigServerApplication.class, args);
    }
}
