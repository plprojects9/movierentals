<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="tickets" method="post">

		<label>Movie Name:</label> <input type="text" name="movieName"> <br>
		<label>Screen Name:</label> <input type="text" name="screenNo"> <br>
		<label>Seat Number:</label> <input type="text"name="seatNo"> <br>
		<input type="submit" value="Purchase Ticket">

	</form>
	
	${msg}

</body>
</html>