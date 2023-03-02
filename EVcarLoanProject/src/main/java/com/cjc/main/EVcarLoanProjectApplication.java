package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class EVcarLoanProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EVcarLoanProjectApplication.class, args);
	}

}
