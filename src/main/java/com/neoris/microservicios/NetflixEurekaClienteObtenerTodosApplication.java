package com.neoris.microservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class NetflixEurekaClienteObtenerTodosApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaClienteObtenerTodosApplication.class, args);
	}
}
