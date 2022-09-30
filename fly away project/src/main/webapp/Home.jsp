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

	 <%
         Date dNow = new Date( );
         SimpleDateFormat ft =new SimpleDateFormat ("yyyy-MM-dd");
         String dt1=ft.format(dNow);
         Calendar cal= Calendar.getInstance();
         cal.add(Calendar.DAY_OF_MONTH,180);
         String dt2=ft.format(cal.getTime());
         Calendar cal2= Calendar.getInstance();
         cal2.add(Calendar.DAY_OF_MONTH,1);
         String tmdt=ft.format(cal2.getTime());
      %> 
      
	<div align="center">
	 
		<i><h1>FlyAway</h1></i>
		<h4 align="right"> - devloped by P Praveen kumar</h4>
		
		<br><br>
		
		
		<h3>Book Flight Tickets</h3>
		<form action="homecheck" method ="post"><br>
		<table HEIGHT="200%">
			<tr>
				<td><b>Depature Date</b></td>
				<td><input type="date" name="udate" min=<%=dt1%> max=<%=dt2%> value=<%=tmdt%>></td>
			</tr>
			<tr>
				<td><b>From</b></td>
				<td><select  name="ufrom">
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
				<td><b>To</b></td>
				<td><select  name="uto">
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
				<td><b>No of Persons</b></td>
				<td> <select  name="uperson">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select></td>
			</tr>
		</table>
		<br>	
		<input type="submit" value="Search flights">
		<br>
		<br>	
		<b><a href='AdminLogin.jsp'>Admin Login </a></b>
		
			
			
		</form>
	
	</div>
</body>
</html>