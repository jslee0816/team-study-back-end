package com.example.study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webConfig implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("**")
		.allowedOrigins("http://localhost:5173/", "http://localhost:8080/", "http://study-frontend-tl.s3-website-us-east-1.amazonaws.com")
		.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTION")
		.allowCredentials(true)
		.maxAge(3000);
	}

}
