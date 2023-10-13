package com.sony.weatherapp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties {

	@JsonProperty("updated")
	private String updated;
	@JsonProperty("units")
	private String units;
	@JsonProperty("forecastGenerator")
	private String forecastGenerator;
	@JsonProperty("generatedAt")
	private String generatedAt;
	@JsonProperty("updateTime")
	private String updateTime;
	@JsonProperty("validTimes")
	private String validTimes;
	@JsonProperty("elevation")
	private Elevation elevation;
	@JsonProperty("periods")
	private List<Period> periods;
	
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getForecastGenerator() {
		return forecastGenerator;
	}
	public void setForecastGenerator(String forecastGenerator) {
		this.forecastGenerator = forecastGenerator;
	}
	public String getGeneratedAt() {
		return generatedAt;
	}
	public void setGeneratedAt(String generatedAt) {
		this.generatedAt = generatedAt;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getValidTimes() {
		return validTimes;
	}
	public void setValidTimes(String validTimes) {
		this.validTimes = validTimes;
	}
	public Elevation getElevation() {
		return elevation;
	}
	public void setElevation(Elevation elevation) {
		this.elevation = elevation;
	}
	public List<Period> getPeriods() {
		return periods;
	}
	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

	
}