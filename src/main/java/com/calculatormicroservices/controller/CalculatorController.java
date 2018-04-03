package com.calculatormicroservices.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/v1")
public class CalculatorController {

	
	@RequestMapping(value = "/add/{arg1}/{arg2}" , method = RequestMethod.GET)
	public double add(@PathVariable("arg1") final double arg1, @PathVariable("arg2") final double arg2){
		return arg1 + arg2;
	}
	
	@RequestMapping(value = "/sub/{arg1}/{arg2}" , method = RequestMethod.GET)
	public double sub(@PathVariable("arg1") final double arg1, @PathVariable("arg2") final double arg2){
		return arg1 - arg2;
	}
	
	@RequestMapping(value = "/mul/{arg1}/{arg2}" , method = RequestMethod.GET)
	public double mul(@PathVariable("arg1") final double arg1, @PathVariable("arg2") final double arg2){
		return arg1 * arg2;
	}
	
	@RequestMapping(value = "/div/{arg1}/{arg2}" , method = RequestMethod.GET)
	public double div(@PathVariable("arg1") final double arg1, @PathVariable("arg2") final double arg2){
		return arg1 / arg2;
	}
}
