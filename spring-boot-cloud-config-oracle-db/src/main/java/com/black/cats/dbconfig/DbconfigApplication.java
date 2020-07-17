package com.black.cats.dbconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DbconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbconfigApplication.class, args);
	}

}
