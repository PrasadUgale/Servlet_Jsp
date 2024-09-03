<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Declaration tag</title>
</head>
<body>
<h3>Declaration tag</h3>
The JSP declaration tag is used to declare fields and methods.
<br>
The code written inside the jsp declaration tag is placed outside the service() method of auto generated servlet.
<br>
So it doesn't get memory at each request.
<br>

<!-- Declaration tag syntax  -->
<%! int data=50; %>  
<%!   
	int cube(int n){  
	return n*n*n;  
	}  
%>  

<br>
<%= "Value of the variable is:"+data %>  
<br>
<%= "Cube of 3 is:"+cube(3) %>  

</body>
</html>