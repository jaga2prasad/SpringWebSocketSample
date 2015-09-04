package com.jaga.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jaga.model.Greeting;
import com.jaga.model.HelloMessage;

@Controller

public class TestController {
	@RequestMapping("/jaga")
		public String testMV(ModelMap model){
			model.addAttribute("message", "Hello Spring MVC Framework!");
			return "hello";
		}
	
	//@RequestMapping("/hello")
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage jjjjjsd) throws Exception{
		
		Thread.sleep(3000);
		
		return new Greeting(jjjjjsd.getName());
		
	}
	
	@RequestMapping("/jjjj")
	public String tttttt(ModelMap model){
		return "jagaTest";
	}
}
