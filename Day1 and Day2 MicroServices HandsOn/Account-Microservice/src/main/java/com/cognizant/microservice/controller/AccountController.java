package com.cognizant.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allaccounts")
public class AccountController {
	
	@GetMapping("/{number}")
	public String getAccountByNumber(@PathVariable Integer number)
	{
		return "{ number: \"00987987973432\", type: \"savings\", balance: 234343 }";
	}
}
