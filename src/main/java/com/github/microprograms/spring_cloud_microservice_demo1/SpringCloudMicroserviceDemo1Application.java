package com.github.microprograms.spring_cloud_microservice_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudMicroserviceDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroserviceDemo1Application.class, args);
	}

}
