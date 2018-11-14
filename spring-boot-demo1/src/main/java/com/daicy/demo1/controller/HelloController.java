package com.daicy.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	@RequestMapping("/hellos/{name}")
	public String hello(@PathVariable("name") String name,Model model){
			model.addAttribute("name", name);
			return "redirect:/static/Nohello.html";
	 	 }
	
	
	
	
	
	@RequestMapping("/ceshi")
	public String helloceshi(Model model){
			System.out.println("------00000000002--------");
			/*ModelAndView mv=new ModelAndView();
			mv.setViewName("forward:/static/Nohello.html");
			mv.addObject("name", "张三丰");*/
			model.addAttribute("name", "张三");
			//model.addAttribute("name", "张三丰");
			//return "redirect:/static/Nohello.html";
			return "redirect:/static/Nohello.html";
	}
	
	
	
	@RequestMapping("/ceship")
	public String helloceshis(ModelAndView mv){
			System.out.println("------tttt--------"+mv.getViewName());
			return "redirect:/static/Nohello.html";
	 	 }
	
	
	
	/*@RequestMapping("/index")
    String homes() {
		System.out.println("jnlail");
        return "redirect:hello.html";
    }*/
	
	@RequestMapping("/index7")
    String homess(Model model) {
		model.addAttribute("name", "阿凡达是");
        return "hello";
    }
	

	//跳转方式一：直接返回字符串，字符串为html的名字，视图会自动解析。因为spring Boot加载html默认到resources/templates里寻找：
	//相当于本例是去找resources/templates/hello.html
	@RequestMapping("/index1")
    String homes1(Model model) {
		model.addAttribute("name", "李思思");
        return "Nohello.html";
    }
	
	//跳转方式二：使用ModelAndView去跳转视图。spring Boot加载html默认到resources/templates里寻找
	@RequestMapping("/index2")
	String homes2() {
		System.out.println("000");
		//ModelAndView mv=new ModelAndView("redirect:hello.html");
		//mv.addObject("name", "zhang");
        return "redirect:hello.html";
    }
	
	@RequestMapping("/index3")
    String homes3() {
        return "/ceshi";
    }
	
	@RequestMapping("/index4")
    String homes4() {
        return "ceshi";
    }
	
	}
