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
</style>
</head>
<body>
	<h1>Traveller Profile</h1>
	
	<div id= "nav2">
	<h2>Prateek Kishore Kahnojia (Edit)</h2>
	
	<img src="resources/BlazeNonCahalnt.jpg" alt="no image found">
	<ul style="list-style-type:circle">	
  <li>29</li>
  <li>Male</li>
  <li>Noida, India</li>
  <li>Veteran</li>
  <li><a href="http://facebook.com/indiagator">Facebook Page</a></li>
</ul> 
</div>

<div id="nav"><h2>About Me</h2><p>I am a Star-Seed on a tour of planet Earth, I was born in India but I belong to the World.

Just wanna see the Colors of Humanity, and the Cultures separated by distance.

in essence we are all one, one family...children of the Mother Earth.

I am working to make this world a better place for everyone. A global system that makes it possible for everyone to have the Wonderful Experiences that they were entitled to when they took birth on this lonely planet Earth.

PHILOSOPHY

If you're not in LOVE 24/7, you're not really alive.</p>

<h2>References (Write a Reference...)</h2>
<ul style="list-style-type:circle">
 		 <li><p>Amazing Guy... We went on a trip to HImachal and he was...</li>
  			<li><p>Super Cool Dude! We went on a trip to Nepal and he was our Navigator...</li> 
	</ul>
</div>

<div id = "nav2">
<h2>Countries Visted (2) (Add More +)</h2>
	<ul style="list-style-type:circle">
 		 <li>India (- Remove)</li>
  			<li>Nepal (- Remove)</li> 
	</ul>
	
	
	<h2>Countries to be Visited (2) (Add More +)</h2>
	<ul style="list-style-type:circle">
 		 <li>Russia (- Remove)</li>
  			<li>Spain (- Remove)</li> 
	</ul>

<h2>Trips (75) (Add More +)</h2>
	<ul style="list-style-type:circle">
 		 <li><a href="/webapp/trip">Created Trips (25) (Add More +)</a></li>
  			<li>Joined  Trips (50) (Add More +)</li> 
	</ul>
	
	
	<h2>Basic Functionality</h2>
	<ul style="list-style-type:circle">
 		 <li>Edit Profile (if logged in)</li>
  			<li>Send Message</li> 
  			<li>Write a Reference</li> 
  			<li>Print*</li>
	</ul>
	 </div>
</body>
</html>