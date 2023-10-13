package com.sony.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Period {

	@JsonProperty("number")
	private Integer number;
	@JsonProperty("name")
	private String name;
	@JsonProperty("startTime")
	private String startTime;
	@JsonProperty("endTime")
	private String endTime;
	@JsonProperty("isDaytime")
	private Boolean isDaytime;
	@JsonProperty("temperature")
	private Integer temperature;
	@JsonProperty("temperatureUnit")
	private String temperatureUnit;
	@JsonProperty("temperatureTrend")
	private Object temperatureTrend;
	@JsonProperty("probabilityOfPrecipitation")
	private ProbabilityOfPrecipitation probabilityOfPrecipitation;
	@JsonProperty("dewpoint")
	private Dewpoint dewpoint;
	@JsonProperty("relativeHumidity")
	private RelativeHumidity relativeHumidity;
	@JsonProperty("windSpeed")
	private String windSpeed;
	@JsonProperty("windDirection")
	private String windDirection;
	@JsonProperty("icon")
	private String icon;
	@JsonProperty("shortForecast")
	private String shortForecast;
	@JsonProperty("detailedForecast")
	private String detailedForecast;
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Boolean getIsDaytime() {
		return isDaytime;
	}
	public void setIsDaytime(Boolean isDaytime) {
		this.isDaytime = isDaytime;
	}
	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	public String getTemperatureUnit() {
		return temperatureUnit;
	}
	public void setTemperatureUnit(String temperatureUnit) {
		this.temperatureUnit = temperatureUnit;
	}
	public Object getTemperatureTrend() {
		return temperatureTrend;
	}
	public void setTemperatureTrend(Object temperatureTrend) {
		this.temperatureTrend = temperatureTrend;
	}
	public ProbabilityOfPrecipitation getProbabilityOfPrecipitation() {
		return probabilityOfPrecipitation;
	}
	public void setProbabilityOfPrecipitation(ProbabilityOfPrecipitation probabilityOfPrecipitation) {
		this.probabilityOfPrecipitation = probabilityOfPrecipitation;
	}
	public Dewpoint getDewpoint() {
		return dewpoint;
	}
	public void setDewpoint(Dewpoint dewpoint) {
		this.dewpoint = dewpoint;
	}
	public RelativeHumidity getRelativeHumidity() {
		return relativeHumidity;
	}
	public void setRelativeHumidity(RelativeHumidity relativeHumidity) {
		this.relativeHumidity = relativeHumidity;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getShortForecast() {
		return shortForecast;
	}
	public void setShortForecast(String shortForecast) {
		this.shortForecast = shortForecast;
	}
	public String getDetailedForecast() {
		return detailedForecast;
	}
	public void setDetailedForecast(String detailedForecast) {
		this.detailedForecast = detailedForecast;
	}

	
	
}
