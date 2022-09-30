<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FlyAway.home2</title>
</head>
<body style="background:url(pic2.jpg.jpg)  no-repeat;background-size:100% auto; ">
      
	<div align="center">
		<i><h1>FlyAway</h1></i>
		<h3>Delete Flight Details</h3>
		<form action="deleteflights" method ="post"><br>
		<table>
			<tr>
			    <td><b>Flight No</b></td>
				<td><input type="number" name="flightno" ></td>
			</tr>
		</table>
		<br>	
		<input type="submit" name= "add" value="Delete flight">
		<br>
		<br>
		<b><a href='flightsmod'>back</a><br></b>	
			
			
		</form>
	
	</div>
</body>
</html>