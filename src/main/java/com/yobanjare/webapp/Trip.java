package com.yobanjare.webapp;

import java.util.*;

//Untested

public class Trip {	
	
	private String id;
	@SuppressWarnings("unused")
	private String title;
	private Vector<TripStop> tripStops = new Vector<TripStop>(0);
	private Vector<TripSegment> tripSegments = new Vector<TripSegment>(0);	

	private int duration;
	private int cost;
	
	//private generateId(){};	
	
	public Trip(String title, TripStop origin, TripStop destination) {
		
		super();
		this.title = title;
		//this.id=generateId();
		tripStops.add(origin);
		tripStops.add(destination);
		
		tripSegments.add(new TripSegment(origin,destination));
		
	}	
	
	public int addStopnSegment(TripStop tripStop){
		
		tripStops.add(tripStop);
		tripSegments.add(new TripSegment((TripStop) tripSegments.lastElement().getStopDestination(),tripStop));
		return tripStops.capacity();
		
	}
	
	public TripStop delStopnSegment(int index){
		
		TripStop deleted;
		
		TripStop newOrigin;
		TripStop newDestination;
		
		deleted = tripStops.remove(index);
		
		if(index!= 0 ||(index!=  tripSegments.size()-1) )
			{
			
			newOrigin = tripSegments.get(index-1).getStopOrigin();
			newDestination = tripSegments.get(index).getStopDestination();
			
			tripSegments.remove(index-1);
			tripSegments.remove(index);
			
			tripSegments.add(index-1, new TripSegment(newOrigin, newDestination));
			
			}
		else if( index == 0)
		{
			tripSegments.remove(index);			
		}
		else if( index == tripSegments.size()-1)
		{			
			tripSegments.remove(index-1);
		}
		
		
		return deleted;
		
	}
	
	 
	
}
