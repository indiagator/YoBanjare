package com.yobanjare.webapp;

//Untested


import java.time.*;

public class TripSegment {
	
	private String originCity;
	private String destinationCity;
	private String originCountry;
	private String destinationCountry;	
	
	private LocalDate dateStart;
	private LocalDate dateEnd;
	
	private char modeTransport;
	private int cost;
	private char typeTravel;
	private long distance;	
	
	private TripStop stopOrigin;
	private TripStop stopDestination;
	
		
	
	public TripSegment(String originCity, String originCountry,
			String destinationCity, String destinationCountry,
			LocalDate dateStart, LocalDate dateEnd) {
		super();
		this.originCity = originCity;
		this.originCountry = originCountry;
		this.destinationCity = destinationCity;
		this.destinationCountry = destinationCountry;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}	
	
	public TripSegment(TripStop stopOrigin, TripStop stopDestination) {
		super();
		this.stopOrigin = stopOrigin;
		this.stopDestination = stopDestination;
		
		this.originCity = stopOrigin.getLocationCity();
		this.originCountry=stopOrigin.getlocationCountry();
		this.destinationCity=stopDestination.getLocationCity();
		this.destinationCountry=stopDestination.getlocationCountry();
		this.dateStart=stopOrigin.getDateTo();
		this.dateEnd=stopDestination.getDateFrom();		
		
	}
	
	public String getOriginCity() {
		return originCity;
	}
	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public String getOriginCountry() {
		return originCountry;
	}
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public char getModeTransport() {
		return modeTransport;
	}
	public void setModeTransport(char modeTransport) {
		this.modeTransport = modeTransport;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public char getTypeTravel() {
		return typeTravel;
	}
	public void setTypeTravel(char typeTravel) {
		this.typeTravel = typeTravel;
	}
	public long getDistance() {
		return distance;
	}
	public void setDistance(long distance) {
		this.distance = distance;
	}
	
	
	public LocalDate getDateStart() {
		return dateStart;
	}
	public void setDateStart(LocalDate dateStart) {
		this.dateStart = dateStart;
	}
	public LocalDate getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}
	public TripStop getStopOrigin() {
		return stopOrigin;
	}
	public void setStopOrigin(TripStop stopOrigin) {
		this.stopOrigin = stopOrigin;
	}
	public TripStop getStopDestination() {
		return stopDestination;
	}
	public void setStopDestination(TripStop stopDestination) {
		this.stopDestination = stopDestination;
	}
	
	
	
	

}
