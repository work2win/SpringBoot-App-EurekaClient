package com.work2win.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class SampleEurekaRestController {
	
	private final DiscoveryClient discoveryClient;
	private final RestClient restClient;
	
	
	public SampleEurekaRestController(DiscoveryClient discoveryClient, RestClient.Builder restClientBuilder) {
		
		this.discoveryClient = discoveryClient;
		restClient = restClientBuilder.build();
	}
	
	
	@GetMapping("SampleEureka")
	public String helloWorld() {
		ServiceInstance serviceInstance = discoveryClient.getInstances("SpringBoot-EurekaClient").get(0);
		String serviceAResponse = restClient.get()
				.uri(serviceInstance.getUri() + "/helloWorld")
				.retrieve()
				.body(String.class);
		return serviceAResponse;
	}
	
	

}
