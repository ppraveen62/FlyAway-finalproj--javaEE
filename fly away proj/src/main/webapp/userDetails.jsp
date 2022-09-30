<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.flightsServlet"%>
<%@page import="com.flightsServlet2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user</title>
</head>
<body style="background:url(pic2.jpg.jpg)  no-repeat;background-size:100% auto; ">

	
	<%	
		
		String flightno=flightsServlet2.flightId;	
		int nop=Integer.parseInt(flightsServlet.person);
		String person=String.valueOf(nop);
		int i=1;
	
	%>
	
	<div align="center">
		<i><h1>FlyAway</h1></i>
		<h3>Enter Details</h3>
		<form action="userdetailsverify" method ="post"><br>
		
		<% for(i=1;i<=nop;i++) { %>
			<label><b>Person <%=i %></b></label>
			<table>
			<tr>
			<td><b>Name</b></td>
			<td><input type ="text" name="uname<%=i%>"  ></td>
			</tr>
			<tr>
			<td><b>Gender</b></td>
			<td><select  name="ugender<%=i%>">
                 <option value="Male">Male</option>
                 <option value="Female">Female</option>
                  <option value="Other">Other</option>
                 </select></td>
			</tr>
			<tr>
				<td><b>Age</b></td>
				<td><input type ="number" name="uage<%=i%>" min=1 max=100 value=1></td>
			</tr>
			<tr>
				<td><b>Email Id</b></td>
				<td><input type="email" name="uemail<%=i%>" ></td>
			</tr>
			<tr>
				<td><b>Mobile no</b></td>
				<td><input type="tel" name="umobile<%=i%>"></td>
			</tr>
			</table>
		
		
		<%} %>
			
			<br><input type ="submit" name="add" value="continue">
		</form>
		
		
	</div>
		
	


</body>
</html>