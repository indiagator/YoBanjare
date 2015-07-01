package com.yobanjare.model;

public class TripFlag {
	
	private  String trip;
	private  String flag;
	
	public TripFlag(String trip, String flag) {
		super();
		this.trip = trip;
		this.flag = flag;
	}

	public String getTrip() {
		return trip;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}	

}
