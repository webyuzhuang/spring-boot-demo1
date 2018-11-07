package com.daicy.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SrpingBootDemo1Application {
	/*@SpringBootApplication组合注解，兼备了@EnableAutoConfiguration和@ComponentScan 注解的功能。*/
	//试一下功能好使不
	public static void main(String[] args) {
		System.out.println("--------------");
		
		SpringApplication.run(SrpingBootDemo1Application.class, args);
	}
}
