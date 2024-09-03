<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSTL Core Tags Example</title>
</head>
<body>
    <h1>JSTL Core Tags Example</h1>

    <!-- Output explanation for c:out -->
    <p><strong>c:out Tag:</strong></p>
    <p>The <code>&lt;c:out value="..." /&gt;</code> tag outputs the value of an expression, escaping XML special characters.</p>
    <c:set var="message" value="Hello, JSTL!" />
    <p>Output using <code>&lt;c:out&gt;</code>: <c:out value="${message}" /></p>

    <!-- Output explanation for c:set -->
    <p><strong>c:set Tag:</strong></p>
    <p>The <code>&lt;c:set var="..." value="..." /&gt;</code> tag sets a variable to a specified value in a specific scope.</p>
    <c:set var="counter" value="5" />
    <p>Counter value set using <code>&lt;c:set&gt;</code>: <c:out value="${counter}" /></p>

    <!-- Output explanation for c:if -->
    <p><strong>c:if Tag:</strong></p>
    <p>The <code>&lt;c:if test="..." /&gt;</code> tag evaluates a condition and includes its body content only if the condition is true.</p>
    <c:if test="${counter > 3}">
        <p>The counter is greater than 3.</p>
    </c:if>

    <!-- Output explanation for c:choose, c:when, c:otherwise -->
    <p><strong>c:choose, c:when, c:otherwise Tags:</strong></p>
    <p>The <code>&lt;c:choose&gt;</code> tag is a conditional construct that works like a switch statement, where you can specify multiple <code>&lt;c:when&gt;</code> conditions and an optional <code>&lt;c:otherwise&gt;</code> for the default case.</p>
    <c:choose>
        <c:when test="${counter == 5}">
            <p>The counter is exactly 5.</p>
        </c:when>
        <c:when test="${counter < 5}">
            <p>The counter is less than 5.</p>
        </c:when>
        <c:otherwise>
            <p>The counter is greater than 5.</p>
        </c:otherwise>
    </c:choose>

    <!-- Output explanation for c:forEach -->
    <p><strong>c:forEach Tag:</strong></p>
    <p>The <code>&lt;c:forEach var="..." items="..." /&gt;</code> tag iterates over a collection of items, such as a list or array, and processes the body content for each item.</p>
    <c:set var="numbers" value="${[1, 2, 3, 4, 5]}" />
    <ul>
        <c:forEach var="num" items="${numbers}">
            <li>Number: <c:out value="${num}" /></li>
        </c:forEach>
    </ul>

    <!-- Output explanation for c:import -->
    <p><strong>c:import Tag:</strong></p>
    <p>The <code>&lt;c:import url="..." /&gt;</code> tag allows you to import content from a URL, such as another JSP or an external resource.</p>
    <p>Importing content from another JSP:</p>
    <c:import url="header.jsp" />

</body>
</html>
