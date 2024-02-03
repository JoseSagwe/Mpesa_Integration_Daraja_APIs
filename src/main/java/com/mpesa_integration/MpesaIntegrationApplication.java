package com.mpesa_integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MpesaIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpesaIntegrationApplication.class, args);
	}

	//Creating the bean to inject it all over the application without creating an instance every time
	@Bean
	public OkHttpClient getOkHttpClient() {
		return new OkHttpClient();
	}

	@Bean
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}


}
