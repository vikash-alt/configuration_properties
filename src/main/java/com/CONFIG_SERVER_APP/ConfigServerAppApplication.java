package com.CONFIG_SERVER_APP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerAppApplication.class, args);
	}

}
