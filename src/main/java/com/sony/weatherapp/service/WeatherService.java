package com.sony.weatherapp.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.sony.weatherapp.model.Period;
import com.sony.weatherapp.model.WeatherForecaseList;
import com.sony.weatherapp.model.WeatherForecast;
import com.sony.weatherapp.model.WeatherForecastResponse;

import reactor.core.publisher.Mono;

@Service
public class WeatherService {

	@Value("${weather-url}")
	private String weatherUrl;
	
	@Autowired
	private WebClient.Builder webClientBuilder;

    public Mono<WeatherForecaseList> getWeatherForecast() {
        return webClientBuilder.build()
                .get()
                .uri(weatherUrl)
                .retrieve()
                .bodyToMono(WeatherForecastResponse.class)
                .map(this::parseWeatherResponse);
    }

    private WeatherForecaseList parseWeatherResponse(WeatherForecastResponse response) {
        
    	WeatherForecaseList weatherForecaseList = new WeatherForecaseList();
    	
    	if(response!=null && response.getProperties()!=null) {
    		List<WeatherForecast> weatherForecastList = new ArrayList<>();
    		List<Period> periodList = response.getProperties().getPeriods();
    		WeatherForecast weatherForecast;
    		
    		LocalDate currentDate = LocalDate.now();
    		System.out.println(">>>current Date: "+currentDate);
    		
    		for(Period period : periodList) {
    			weatherForecast = new WeatherForecast();
    			
    			String startDateTime = period.getStartTime();
    			String endDateTime = period.getEndTime();
    			LocalDate localStartDate = LocalDate.parse(startDateTime, DateTimeFormatter.ISO_DATE_TIME);
    			LocalDate localEndDate = LocalDate.parse(endDateTime, DateTimeFormatter.ISO_DATE_TIME);
    			System.out.println("Parsed Start Date Time: "+localStartDate);
    			System.out.println("Parsed End Date Time: "+localEndDate);
    			
    			if(localStartDate.compareTo(currentDate)==0 || localEndDate.compareTo(currentDate)==0) {
    				weatherForecast.setDayName(period.getName());
        			weatherForecast.setTempHighCelsius(period.getTemperature());
        			weatherForecast.setForecastBlurp(period.getShortForecast());
        			weatherForecastList.add(weatherForecast);
    			}    			
    		}
    		weatherForecaseList.setDaily(weatherForecastList);
    	}       
		return weatherForecaseList;
    }
    
}
