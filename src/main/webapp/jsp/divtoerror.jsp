<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorpage.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int num1 = Integer.valueOf(request.getParameter("num1"));
	int num2 = Integer.valueOf(request.getParameter("num2"));
	int div = num1/num2;
	%>
	
	<h1 align="center"><%= "Division of provided numbers is" + div %></h1>
</body>
</html>