package com.sony.weatherapp.model;

public class WeatherForecast {

	private String dayName; 
	private double tempHighCelsius; 
	private String forecastBlurp;
	
	public WeatherForecast(String dayName, double tempHighCelsius, String forecastBlurp) {
		// TODO Auto-generated constructor stub
		this.dayName=dayName;
		this.tempHighCelsius=tempHighCelsius;
		this.forecastBlurp=forecastBlurp;
	}

	public WeatherForecast() {
		// TODO Auto-generated constructor stub
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public double getTempHighCelsius() {
		return tempHighCelsius;
	}

	public void setTempHighCelsius(double tempHighCelsius) {
		this.tempHighCelsius = tempHighCelsius;
	}

	public String getForecastBlurp() {
		return forecastBlurp;
	}

	public void setForecastBlurp(String forecastBlurp) {
		this.forecastBlurp = forecastBlurp;
	}

	
}
