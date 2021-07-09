package com.cognizant.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allloans")
public class LoanController {
	
	@GetMapping("/{number}")
	public String getLoanByNumber(@PathVariable Integer number)
	{
		return "{ number: \"H00987987972342\", type: \"car\", loan: 400000, emi: 3258, tenure: 16 }";
	}
}
