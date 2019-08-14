package com.hw.cp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HwCarPoolingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HwCarPoolingApplication.class, args);
	}

}
