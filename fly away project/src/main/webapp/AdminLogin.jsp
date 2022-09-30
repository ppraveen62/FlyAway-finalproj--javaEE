<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login verify</title>
</head>
<body style="background:url(pic2.jpg.jpg)  no-repeat;background-size:100% auto; ">
	<div align="center">
		<i><h1>FlyAway</h1></i>
		<form action="adminVerify" method ="post"><br>
			<table>
			<tr>
			<td><b>Email Id</b></td>
			<td><input type ="text" name="emailid" ></td>
			</tr>
			<tr>
			<td><b>Password</b></td>
			<td><input type ="password" name="pswrd"><br></td>
			</tr>
			</table><br>
			<input type="submit" value="login">
			
		</form>
		
	</div>
	



</body>
</html>