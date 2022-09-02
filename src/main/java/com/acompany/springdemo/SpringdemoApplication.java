package com.acompany.springdemo;

import com.acompany.springdemo.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);

		UserRepository ur = new UserRepository();
		ur.pri();

	}

}
