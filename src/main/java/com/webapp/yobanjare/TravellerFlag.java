package com.webapp.yobanjare;

public class TravellerFlag {
	
	private String traveller;
	
	private String flag;
	
	public TravellerFlag(String traveller, String flag) {
		super();
		this.traveller = traveller;
		this.flag = flag;		
	}
	
	public String getTraveller() {
		return traveller;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}	

}
