<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World - JSP tutorial</title>
<style>
#nav {
    background-color:#eeeeee;    
    width:70%;
    float:left;
    padding:5px; 
}

#nav2 {
    background-color:#eeeeff;    
    width:70%;
    float:left;
    padding:5px; 
}
ul#menu li {
    display:inline;
}
</style>
</head>
<body>
	
	<div id="nav" >
	<h2>Trip/HangOut/Event</h2>
	<p> Trips are created once and can be deleted by the one who created. He can add more people as moderators. Trips yet to be undertaken are open.
	 Trips already over are closed. Trips that are currently Underway are marked so. The process of updation of Trip data (Primarily Photo and Comments) will be dynamic.
	 Travellers will be able to Join or Leave the trip on one of its Segments. Hence a Trip underway will generate a lot of data and will attract more attention.
	 Tips for Travel can be updated dynamically and will go to a central repository under the appropriate category (Requirements, Destination, Time of the Year, Events...). 
	 A process of Checkin will be used either through GPS or Physical Checkin (Partner Cafes/Hostels). Multiple Threads on Map will show the Route or the Itinerary of the
	 Trip. Travellers can chose to join a Trip if it is Open or Underway with permission from the Moderators. They can chose to part ways and their routes will be shown on the map
	 even if they diverge. A route will be removed if the Moderators remove all the Travellers on that Route.
	</p></div>
	
	<div id= "nav2">
	<h1>The Trip to Saigon (Open) (Closed) (Underway)</h1>	
	<ul style="list-style-type:circle">	
  		<li><b>45 Days</b></li>
  		<li><b>INR 7000</b></li>
  		<li><b>Adventure</b></li>  
  		<li><span style="padding:5px"><b>India</b></span><span style="padding:5px"><b>China</b></span><span style="padding:5px"><b>Russia</b></span></li> 		
	</ul> 
	</div>
	
	<div id= "nav">	
	<h1>Travellers</h1>
	<ul style="list-style-type:circle">	
  		<li><b>Diego</b></li>
  		<li><a href="/webapp/traveller"><b>Prateek (Creator)</b></a></li>
  		<li><b>Elena</b></li>  		
	</ul> 
	</div>
	
	<div id= "nav2">	
	<h1>Trip Stops</h1>
	<ul style="list-style-type:circle">	
  		<li><b>New Delhi (Start 25.May.2015) (3 days)(Change Start +)</b></li>
  		<li>By Road (24 Hrs) (INR 1200)</li>
  		<li><b>Leh (3 days) (Add Stop + Before/After) (-Remove Stop)</b></li>
  		<li>By Road (24 Hrs) (INR 1200)</li>
  		<li><b>Xa'nadu (3 days)(Add Stop + Before/After) (-Remove Stop)</b></li> 
  		<li>By Train (24 Hrs) (INR 1200)</li> 
  		<li><b>Beijing (3 days)(Add Stop + Before/After) (-Remove Stop)</b></li>  
  		<li>By Road (24 Hrs) (INR 1200)</li>	
  		<li><b>Barnaul (3 days)(Add Stop + Before/After) (-Remove Stop)</b></li> 
  		<li>By Air (24 Hrs) (INR 1200)</li>
  		<li><b>Moscow (3 days)(Add Stop + Before/After) (-Remove Stop)</b></li> 
  		<li>By Air (24 Hrs) (INR 1200)</li>
  		<li><b>New Delhi (3 days)(Add Stop + Before/After) (-Remove Stop)</b></li>	
	</ul> 
	</div>
	
	<div id= "nav">	
	<h1>Comments/Tips</h1>
	<ul style="list-style-type:circle">	
  		<li><b>What about the documents?</b></li>  		
  		<li><b>How tough is it going to be?</b></li>  		
  		<li><b>Is it really possible?</b></li>   		
  		<li><b>I have done this  before... check out my trip</b></li>
  		
	</ul> 
	</div>
	
	<div id= "nav2">	
	<h1>Trip Photos</h1>
	<ul id="menu" style="list-style-type:circle">	
  		<li><img src="resources/trip1.jpg" alt="no image found" style="width:304px;height:228px"></li>
  		<li><img src="resources/trip2.jpg" alt="no image found" style="width:304px;height:228px"></li>
  		<li><img src="resources/trip3.jpg" alt="no image found" style="width:304px;height:228px"></li>  
  		<li><img src="resources/trip4.jpg" alt="no image found" style="width:304px;height:228px"></li> 		
	</ul> 
	</div>
	
	
</body>
</html>