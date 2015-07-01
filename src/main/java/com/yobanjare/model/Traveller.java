package com.yobanjare.model;

//Untested


import java.util.*;

public class Traveller {

	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private String locationCity;
	private String locationCountry;
	private char sex;	
	
	private Vector<String> placesVisited = new Vector<String>(0);
	private Vector<String> placesToBeVisited = new Vector<String>(0);	
	
	private Vector<TripFlag> trips = new Vector<TripFlag>(0);
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public String getLocationCountry() {
		return locationCountry;
	}

	public void setLocationCountry(String locationCountry) {
		this.locationCountry = locationCountry;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Vector<String> getPlacesVisited() {
		return placesVisited;
	}

	public void setPlacesVisited(String cityorcountry) {
		this.placesVisited.addElement(cityorcountry); 
	}

	public void delPlacesVisted(String cityorcountry){		
		int index;
		index=this.placesVisited.indexOf(cityorcountry);
		this.placesVisited.removeElementAt(index);
	}
	
	public Vector<String> getPlacesToBeVisited() {
		return placesToBeVisited;
	}

	public void setPlacesToBeVisited(String cityorcountry) {
		this.placesToBeVisited.addElement(cityorcountry); 
	}

	public void delPlacesToBeVisted(String cityorcountry){		
		int index;
		index=this.placesToBeVisited.indexOf(cityorcountry);
		this.placesToBeVisited.removeElementAt(index);
	}
	
	public void associateNewTrip(String tripId){
		
		trips.add(new TripFlag(tripId, Flags.c));
	}
	
	public void joinTrip(String tripId){
		
		trips.add(new TripFlag(tripId, Flags.j));
	}
	
	public void removeTrip(String tripId){
		
		TripFlag temp1 = new TripFlag(tripId, Flags.c);
		TripFlag temp2 = new TripFlag(tripId, Flags.j);
		
		if(!trips.remove(temp1))
		{
			trips.remove(temp2);
		}
		
	}
	
}
