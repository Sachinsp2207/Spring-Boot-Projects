package com.example.Bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.Bootdemo.controller")  //  used to specify 
@EntityScan(basePackages = "com.example.Bootdemo.dto" )
@EnableJpaRepositories(basePackages ="com.example.Bootdemo.repository")
public class BootdemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BootdemoApplication.class, args);
	}

}
