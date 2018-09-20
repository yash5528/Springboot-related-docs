package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignOtherController {

	@Autowired
	AccountService account;
	
	@RequestMapping("/")
	public String info()
	{
		return account.disp();
	}
}
