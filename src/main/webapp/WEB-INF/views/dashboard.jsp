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
	<h1>Dashboard</h1>
	
	
	<div id="nav">
	<a href="/webapp/traveller">Your Profile</a>
	</div>
	
	<div id="nav2">
	<h2>Your Trips (75) </h2>
	<ul style="list-style-type:circle">
 		 <li>Created Trips (25) (Create New Trip +) (- Remove Trip)</li>
  			<li>Joined  Trips (50) ( - Remove Trip)</li> 
	</ul>
	</div>
	
	<div id="nav">
	<h2>Trips starting from your Home Town (786) (Join a Trip +)</h2>
	
	<ul style="list-style-type:circle">
  <li>Golden Triangle</li>
  <li>Sahyadri</li>
  <li>Leh by Bullet</li>
  <li>Seven Sisters</li>
	</ul> 
	</div>

	<div id="nav2">
	<h2>Standard Social Networking Features</h2>
	
	<ul style="list-style-type:circle">
  <li>Messages</li>
  <li>Notifications</li>
  <li>Friend Requests</li>
  <li>Activity</li>
	</ul> 
	</div>

</body>
</html>