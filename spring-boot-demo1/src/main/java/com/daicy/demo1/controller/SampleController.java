package com.daicy.demo1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
    @RequestMapping("/test")
    public String homes(HttpServletRequest request,HttpServletResponse response) throws IOException {
 /*   	PrintWriter out=response.getWriter();
    	out.print("dafdsfadfadf");*/
    	
    	 return "Hello World!";
    }
    
    
}