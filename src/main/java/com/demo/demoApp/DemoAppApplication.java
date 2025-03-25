package com.demo.demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		/// responsible to create application context where we can access other class objects from JVM container
		ApplicationContext context = SpringApplication.run(DemoAppApplication.class, args);
		System.out.println("Welcome to spring boot application project");

		/// by using getBean method we can get the particular class object and can perform the task accordingly
		Main main = context.getBean(Main.class);
		main.build();
	}

}
