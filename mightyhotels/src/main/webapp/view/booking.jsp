<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
<div align ="center"><br><br><br><br>
<h1> Room Booking</h1><br><br>
<form id="bookForm" modelAttribute="roombook" action="bookingprocess" method="post">
<table>

<tr><td>Username: </td><td><input type="text" name="username" required></td></tr>
 <tr><td>Room Number and type : </td><td><input type="text" name="Roomnumber" required></td></tr>
<!-- <tr><td><p>Room number and type :</p></td><td><select name="select" id="#" name="roomnumber" required></td>
					<option value="-">-</option>
					<option value="1">101-Super</option>
					<option value="2">102-Super</option>
					<option value="3">201-Ultra</option>
					<option value="4">202-Ultra</option>
					<option value="5">301-Deluxe</option>
					<option value="6">302-Deluxe</option>
					<option value="7">401-Premium</option>
					<option value="8">402-Premium</option>
					<option value="9">501-Posh</option>
					<option value="10">502-Posh</option></select> -->
				
<tr><td>No of persons to stay: </td><td><input type="text" name="Noofmemberstostay" required></td></tr>
 <!-- </td><td><select name="select1" id="#" name="noofmemberstostay" required></td>
					<option value="-">-</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option></select> -->

<tr><td>Check-in: </td><td><input type="date" name="checkin" required></td></tr>
<tr><td>Check-out: </td><td><input type="date" name="checkout" required></td></tr>
<tr><td></td><td><input type="submit" value="Book Here"></td></tr>
</table>
</form>
</div>
</body>
</html>