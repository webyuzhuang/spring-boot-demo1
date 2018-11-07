package com.daicy.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SrpingBootDemo1Application {
	/*@SpringBootApplication组合注解，兼备了@EnableAutoConfiguration和@ComponentScan 注解的功能。*/
	
	public static void main(String[] args) {
		SpringApplication.run(SrpingBootDemo1Application.class, args);
	}
}
