package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@Component
@SpringBootApplication
public class QuestionsRest {

	public static void main(String[] args) {
		SpringApplication.run(QuestionsRest.class, args);
	}
}