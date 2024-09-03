<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>9 Implicit Objects</title>
</head>
<body>
<h1>9 Implicit Objects in JSP</h1>
<h3>Request Object</h3>
The JSP request is an implicit object of type HttpServletRequest i.e. created for each jsp request by the web container.
<br> It can be used to get request information such as parameter, header information, remote address, server name, server port, content type, character encoding etc.
<br>It can also be used to set, get and remove attributes from the jsp request scope.
<br>
<% String data = request.getParameter("uname"); %>
<%= "uname param from request object: " + data %>
<br>

<br>
<h3>Response Object</h3>
In JSP, response is an implicit object of type HttpServletResponse. The instance of HttpServletResponse is created by the web container for each jsp request.
<br>It can be used to add or manipulate response such as redirect response to another resource, send error etc.
<br>
<% response.addHeader("Data", "From response object in jsp."); %>
<%= "Added Data Header to response using response object" %>
<br>

<br>
<h3>Config Object</h3>
In JSP, config is an implicit object of type ServletConfig. This object can be used to get initialization parameter for a particular JSP page. The config object is created by the web container for each jsp page.
<br>Generally, it is used to get initialization parameter from the web.xml file.
<br>
<%   
	data =config.getInitParameter("uname");  
	out.print("calling init param through config object= "+data);  
%>  
<br>

<br>
<h3>Application Object</h3>
In JSP, application is an implicit object of type ServletContext.
<br>The instance of ServletContext is created only once by the web container when application or project is deployed on the server.
<br>This object can be used to get initialization parameter from configuaration file (web.xml). It can also be used to get, set or remove attribute from the application scope.
<br>This initialization parameter can be used by all jsp pages.
<br>
<%   
	data = application.getInitParameter("uname");  
	out.println("calling init param through application object= "+data);  
	application.setAttribute("uname", "Hi! from Implicitobject.jsp");
	out.println("New attribute set using application object: "+ application.getAttribute("uname"));
%>
<br>

<br>
<h3>Session object</h3>
In JSP, session is an implicit object of type HttpSession.
<br>The Java developer can use this object to set,get or remove attribute or to get session information.

<br>
<h3>PageContext Object</h3>
In JSP, pageContext is an implicit object of type PageContext class.The pageContext object can be used to set,get or remove attribute from one of the following scopes:
<br>1. page
<br>2. request
<br>3. session
<br>4. application
<br>

<br>
<h3>Page Object</h3>
In JSP, page is an implicit object of type Object class.This object is assigned to the reference of auto generated servlet class. It is written as:
<br>Object page=this;
<br>For using this object it must be cast to Servlet type.For example:
<br><\% (HttpServlet)page.log("message"); %>
<br>Since, it is of type Object it is less used because you can use this object directly in jsp.For example:
<br><\% this.log("message"); %>
<br>

<br>
<h3>Exception Object</h3>
In JSP, exception is an implicit object of type java.lang.Throwable class. This object can be used to print the exception. 
<br>But it can only be used in error pages.It is better to learn it after page directive.
<br>




</body>
</html>