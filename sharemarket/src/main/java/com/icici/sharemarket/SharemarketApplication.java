package com.icici.sharemarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.icici.sharemarket")
@ComponentScan("com.icici.sharemarket.service")
@ComponentScan("com.icici.sharemarket.repository")
@ComponentScan("com.icici.sharemarket.controller")
public class SharemarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharemarketApplication.class, args);
	}

}
