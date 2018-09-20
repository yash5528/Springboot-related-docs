package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.ribbon.proxy.annotation.Http.Header;

@FeignClient("Account-Service")
public interface AccountService {

	
	@RequestMapping("/")
	public String disp();
	
}
