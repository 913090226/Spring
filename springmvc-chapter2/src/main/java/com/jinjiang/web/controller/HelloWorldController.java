package com.jinjiang.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloWorldController{
	@RequestMapping("/hello")
	public void sayHello(){
		System.out.println("hello world");
	}
}