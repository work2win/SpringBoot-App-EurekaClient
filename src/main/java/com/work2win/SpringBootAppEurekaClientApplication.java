package com.work2win;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootAppEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppEurekaClientApplication.class, args);
	}

}
