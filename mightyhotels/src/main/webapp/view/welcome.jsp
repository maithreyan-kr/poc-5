<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body >
<h1 align="center">Room Booking</h1>

<body>
	<table>
		<tr>
			<td>Welcome ${firstname }  ${lastname}</td>
		</tr>
		<tr>
		</tr>
		<tr>
		</tr>
		<tr>
		<h1 style="text-align: center; color: black">Welcome to MiGhTy Hotels</h1>
	<br>
	<h4 align="center">Welcoming you to best hotels in South India</h4>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/demo2" user="root"
		password="maith15@10" />
<p style="text-align:right" > Available - green</p>
<p style="text-align:right"> Booked - Red</p>
	<sql:query dataSource="${db}" var="rs">  
SELECT * from hotelroom;  
</sql:query>

	<table border="1" width="50%" align="center">
		<tr>
			<th style="color: black">RoomNumber</th>
			<th style="color: black">RoomType</th>
			<th style="color: black">Availability</th>
		</tr>
		<c:forEach var="table" items="${rs.rows}">
			<tr>
				<th><c:out value="${table.room_number}" /></th>
				<th><c:out value="${table.room_type}" /></th>
				<c:choose>
					<c:when test="${table.availability=='Booked'}">
						<th style="color: Red"><c:out value="${table.availability }" /></th>
					</c:when>
					<c:otherwise>
						<th style="color: green"><c:out value="${table.availability }" /></th>
					</c:otherwise>
				</c:choose>
				
			</tr>
		</c:forEach>
	</table>
			<td><a href="index">Home</a></td>
			<td><a href="booking">Book Room</a></td>
		</tr>
	</table>
</body>
</html>