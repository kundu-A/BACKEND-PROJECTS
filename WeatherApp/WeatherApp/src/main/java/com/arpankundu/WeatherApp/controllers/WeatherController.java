package com.arpankundu.WeatherApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@GetMapping("/greet")
	public String Greet() {
		return "Hello , Welcome the Weather Application!!";
	}
}
