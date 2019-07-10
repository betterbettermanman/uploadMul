package com.main.uploadfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.main.uploadfile")
@EnableAutoConfiguration
public class UploadfileApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(UploadfileApplication.class, args);
		String property = configurableApplicationContext.getEnvironment().getProperty("spring.mvc.view.prefix");
		String port = configurableApplicationContext.getEnvironment().getProperty("server.port");
		System.out.println(property);
		System.out.println(port);
	}
}
