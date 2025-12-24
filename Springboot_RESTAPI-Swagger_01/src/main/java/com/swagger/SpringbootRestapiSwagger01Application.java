package com.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Doctor_db OpenAPI",
				version = "1.0.0",
				description = "This is Doctor Database Documents"
				),
		servers = @Server(
				url = "http://localhost:8080",
				description = "This is the url to access the doctor db"
				)
		)
public class SpringbootRestapiSwagger01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestapiSwagger01Application.class, args);
	}

}
