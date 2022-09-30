<%@page import="java.util.Random"%>
<%@page import="com.paymentcheck"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking confirm</title>
</head>
<body style="background:url(pic2.jpg.jpg)  no-repeat;background-size:100% auto; ">

<%
   String amount=paymentcheck.amount;
   String id=paymentcheck.id;
   Random rand=new Random(); 
	int tid=rand.nextInt(580009999,990009999);


%>
	<div align="center">
		<i><h1>   &#9989; Payment Successful !</h1><br></i>
		<h3>Thank you! Your Booking has been confirmed.</h3><br><br>
		Booking ID :&nbsp;<%=id %> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		Transaction ID :&nbsp;<%=tid %> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		Total Amount Paid :&nbsp;<%=amount %> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<br>
		<br>
		<i><h4>Your booking details have been sent to your mail.</h3><i></i><br><br>
		<form action="Home.jsp"><input type="submit" value="Done"></form><br>
	</div>
</body>
</html>