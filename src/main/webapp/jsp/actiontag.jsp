<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="model.*" %>
<%@ include file="header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Action Tags Example</title>
</head>
<body>
    <h1>JSP Action Tags Example</h1>

    <!-- Output explanation for the jsp:include action -->
    <p><strong>jsp:include Action:</strong></p>
    <p>The <code>&lt;jsp:include page="..." /&gt;</code> action includes the content of another JSP file at request time. This means that the included content is processed during the request, allowing for dynamic content inclusion.</p>

    <p><strong>Content included from header.jsp:</strong></p>
    <jsp:include page="header.jsp" />

    <!-- Output explanation for the jsp:forward action -->
    <p><strong>jsp:forward Action:</strong></p>
    <p>The <code>&lt;jsp:forward page="..." /&gt;</code> action forwards the request to another resource, such as another JSP or a servlet. This allows you to transfer control to another part of the application.</p>


    <!-- Output explanation for the jsp:useBean action -->
    <p><strong>jsp:useBean Action:</strong></p>
    <p>The <code>&lt;jsp:useBean id="..." class="..." /&gt;</code> action creates or locates a JavaBean and makes it available for use in the JSP page. If a bean with the specified ID does not exist, it is instantiated using the specified class.</p>

    <jsp:useBean id="myBean" class="model.MyBean" scope="session" />
    <jsp:setProperty name="myBean" property="message" value="Hello from jsp:useBean!" />
    <p>Bean message: <jsp:getProperty name="myBean" property="message" /></p>

    <!-- Output explanation for the jsp:setProperty action -->
    <p><strong>jsp:setProperty Action:</strong></p>
    <p>The <code>&lt;jsp:setProperty name="..." property="..." value="..." /&gt;</code> action sets a property of a JavaBean to a specified value. This is used to initialize or update bean properties.</p>

    <!-- Output explanation for the jsp:getProperty action -->
    <p><strong>jsp:getProperty Action:</strong></p>
    <p>The <code>&lt;jsp:getProperty name="..." property="..." /&gt;</code> action retrieves the value of a property from a JavaBean and outputs it. This is used to access the current value of a bean property.</p>

    <!-- Note: jsp:forward example -->
    <p><strong>Note:</strong> The <code>&lt;jsp:forward /&gt;</code> action is not demonstrated here because it would redirect to another resource and is better suited for a separate JSP or servlet.</p>
</body>
</html>
