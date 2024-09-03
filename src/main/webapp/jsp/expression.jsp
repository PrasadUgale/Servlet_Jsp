<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression tag</title>
</head>
<body>
<h3>Expression tag</h3>
The code placed within JSP expression tag is written to the output stream of the response.
<br> So you need not write out.print() to write data. It is mainly used to print the values of variable or method.
	<br>
	<br>
	<%= "Welcome "+request.getParameter("uname") %>  
	<br>
	Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
</body>
</html>