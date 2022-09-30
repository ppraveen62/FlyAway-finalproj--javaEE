<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="com.book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment GateWay</title>
</head>
<body style="background:url(pic2.jpg.jpg)  no-repeat;background-size:100% auto; ">>
	<%
		
		String amount=book.price;
	  
	
	%>


	<div align="center">
		<i><h1>FlyAway</h1></i><br>
		<h2>FlyPay</h2>
		<i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		( A Secure Payment Gateway.)</i>
		<form action="paymentcheck" method ="post"><br> 
			<table>
				<tr>
					<td><b>Company</b></td><td>&nbsp;&nbsp;&nbsp;Flyaway</td>
				</tr>
				<tr>
					<td><b>Order Number</b></td><td>&nbsp;&nbsp;&nbsp;<%=book.ran %></td>
				</tr>
				<tr>
					<td><b>Total Amount </b>Rs</td><td>&nbsp;&nbsp;&nbsp;<%=amount %> /-</td>
				</tr>
			</table><br>
			<h3>Card Payment</h3>
			<table>
				
				<tr>
					<td><b>Card Number</b></td><td><input type ="number" name="cardno"></td>
				</tr>
				<tr>
					<td><b>Expiry Date</b></td><td><input type="month" name="month"  min="2022" max="2100"></td>
				</tr>
				<tr>
					<td><b>Password </b></td><td><input type ="password" name="psd"></td>
				</tr>
			</table><br>
			<input type="submit" value="Pay"><br><br>
			
			
			<input type="hidden" id ="order" name="order" value=<%=book.ran %>>
			<input type="hidden" id ="amt" name="amt" value=<%=amount %>>
			
		
		</form>
	</div>
</body>
</html>