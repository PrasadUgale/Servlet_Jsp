<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scriptlet tag</title>
</head>
<body>
<h3>Scriptlet tag</h3>
A scriptlet tag is used to execute java source code in JSP.
<br>
<br>
	<%  
		String name=request.getParameter("uname");  
		out.print("welcome "+name);  
	%>  
</body>
</html>