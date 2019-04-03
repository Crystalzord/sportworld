package com.sportworld.swconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SwConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwConfigServerApplication.class, args);
	}

}
