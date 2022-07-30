package com.Suresh.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Suresh.Feign.FeignUnderstanding;

@RestController
public class FirstController {

	@Autowired
	private FeignUnderstanding feignUnderstanding;

	@GetMapping("/calc/{cname}/{qty}")
	public double getMessages(@PathVariable String cname, @PathVariable int qty) {
System.out.println("coming herer");
		double price = feignUnderstanding.getCompanyName(cname);
System.out.println("invoking first microservice controller");
		double totalStockPrice = price * qty;

		return totalStockPrice;
	}

}