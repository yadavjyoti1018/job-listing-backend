package com.example.joblisting;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class JoblistingApplication {

	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder()
				.group("joblisting-api")
				.pathsToMatch("/**")
				.packagesToScan("com.example.joblisting")
				.build();
	}
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Job Listing API")
						.version("1.0")
						.description("API documentation for the Job Listing application"));
	}

	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}
}
