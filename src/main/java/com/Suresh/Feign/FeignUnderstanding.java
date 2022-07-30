package com.Suresh.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "STOCK-PRICE-API")
public interface FeignUnderstanding {

	@RequestMapping(value = "/price/{cname}" ,method = RequestMethod.GET)
	public double getCompanyName(@PathVariable("cname") String cname);
}
