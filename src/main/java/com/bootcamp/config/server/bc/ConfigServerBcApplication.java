package com.bootcamp.config.server.bc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerBcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerBcApplication.class, args);
	}

}
