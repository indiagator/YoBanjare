package com.yobanjare.webapp;

import java.time.*;

public class TripStop {

	private String locationCity;
	private String loctionCountry;
	
	private LocalDate dateFrom;
	private LocalDate dateTo;
	
	public String getLocationCity() {
		return locationCity;
	}
	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	public String getLoctionCountry() {
		return loctionCountry;
	}
	public void setLoctionCountry(String loctionCountry) {
		this.loctionCountry = loctionCountry;
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
