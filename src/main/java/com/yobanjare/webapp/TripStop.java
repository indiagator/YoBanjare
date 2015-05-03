package com.yobanjare.webapp;

import java.time.*;

public class TripStop {

	private String locationCity;
	private String locationCountry;
	
	private LocalDate dateFrom;
	private LocalDate dateTo;
	
	public String getLocationCity() {
		return locationCity;
	}
	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	public String getlocationCountry() {
		return locationCountry;
	}
	public void setlocationCountry(String locationCountry) {
		this.locationCountry = locationCountry;
	}
	public LocalDate getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(LocalDate dateFrom) {
		this.dateFrom = dateFrom;
	}
	public LocalDate getDateTo() {
		return dateTo;
	}
	public void setDateTo(LocalDate dateTo) {
		this.dateTo = dateTo;
	}
	
}
