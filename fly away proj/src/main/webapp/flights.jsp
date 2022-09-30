<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FlyAway.home</title>
</head>
<body style="background:url(pic2.jpg.jpg)  no-repeat;background-size:100% auto; ">
      
	<div align="center">
		<i><h1>FlyAway</h1></i>
		<h3>Add Flight Details</h3>
		<form action="addflights" method ="post"><br>
		<table>
			<tr>
			    <td><b>Flight No</b></td>
				<td><input type="number" name="flightno" ></td>
			</tr>
			<tr>
				<td><b>Airline Name</b></td>
				<td><input type="text" name="airline" ></td>
			</tr>
			<tr>
				<td><b>Source</b></td>
				<td><select  name="source">
                        <option value="Hyderabad">Hyderabad</option>
                        <option value="Mumbai">Mumbai</option>
                        <option value="Jaipur">Jaipur</option>
                        <option value="Bengaluru">Bengaluru</option>
                        <option value="Kolkata">Kolkata</option>
                        <option value="Pune">Pune</option>
                        <option value="Lucknow">Lucknow</option>
                        <option value="Chennai">Chennai</option>
                        <option value="Vishakapatnam">Vishakapatnam</option>
                        <option value="Surat">Surat</option>
                    </select></td>
			</tr>
			<tr>
				<td><b>Destination</b></td>
				<td><select  name="destination">
                       <option value="Surat">Surat</option>
                        <option value="Mumbai">Mumbai</option>
                        <option value="Jaipur">Jaipur</option>
                        <option value="Bengaluru">Bengaluru</option>
                        <option value="Kolkata">Kolkata</option>
                        <option value="Pune">Pune</option>
                        <option value="Lucknow">Lucknow</option>
                        <option value="Chennai">Chennai</option>
                        <option value="Vishakapatnam">Vishakapatnam</option>
                        <option value="Hyderabad">Hyderabad</option>
                    </select></td>
			</tr>
			<tr>
				<td><b>Departure Time</b></td>
				<td><input type="text" name="departuretime" value="hh:mm"></td>
			</tr>
			<tr>
				<td><b>Arrival Time</b></td>
				<td><input type="text" name="arrivaltime" value="hh:mm"></td>
			</tr>
			<tr>
				<td><b>Trip Fare</b></td>
				<td><input type="number" name="tripfare" ></td>
			</tr>
	
		</table>
		<br>	
		<input type="submit" name= "add" value="Add flight">
		<br>
		<br>
		<b><a href='flightsmod'>back</a><br></b>	
			
			
		</form>
	
	</div>
</body>
</html>