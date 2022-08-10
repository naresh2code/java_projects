package com.example.shopregistryeurekha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShopregistryeurekhaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopregistryeurekhaserverApplication.class, args);
	}

}
