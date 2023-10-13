package com.sony.weatherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sony.weatherapp.model.WeatherForecaseList;
import com.sony.weatherapp.service.WeatherService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;

	@GetMapping("/forecast")
	public Mono<WeatherForecaseList> getWeatherForecast() {
		return weatherService.getWeatherForecast();
	}
}
