package com.practica1.dardos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.practica1.dardos.*" })
public class DardosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DardosApplication.class, args);
	}

}
