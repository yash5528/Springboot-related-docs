package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@RequestMapping("/")
	public String disp()
	{
	   return "Account Service is invoked";	
	}
}
