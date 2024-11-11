package com.example.TestR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TestRApplication {

	public static void main(String[] args) {

		SpringApplication.run(TestRApplication.class, args);
	}

}
