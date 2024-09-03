<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Directives Example</title>
</head>
<body>
    <h1>JSP Directives Example</h1>

    <!-- Output explanation for the page directive -->
    <p><strong>Page Directive:</strong></p>
    <p>The <code>&lt;%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%&gt;</code> directive configures page-specific settings.</p>
    <ul>
        <li><strong>language="java":</strong> Specifies that the scripting language used is Java.</li>
        <li><strong>contentType="text/html; charset=UTF-8":</strong> Defines the content type and character encoding of the response.</li>
        <li><strong>pageEncoding="UTF-8":</strong> Specifies the character encoding used in the JSP page itself.</li>
    </ul>

    <!-- Output explanation for the include directive -->
    <p><strong>Include Directive:</strong></p>
    <p>The <code>&lt;%@ include file="header.jsp"%&gt;</code> directive includes the content of <code>header.jsp</code> at translation time. This means that the contents of <code>header.jsp</code> are merged into <code>index.jsp</code> before the JSP is compiled into a servlet.</p>

    <!-- Output explanation for the taglib directive -->
    <p><strong>Taglib Directive:</strong></p>
    <p>The <code>&lt;%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%&gt;</code> directive declares the use of the JSTL core library with the prefix <code>c</code>. This allows the use of JSTL tags such as <code>&lt;c:out&gt;</code> in the JSP page.</p>

    <!-- Using JSTL core tag to demonstrate taglib directive -->
    <p><strong>Output using JSTL Tag:</strong></p>
    <c:out value="This text is output using the JSTL core taglib." />

    <!-- Include directive example output -->
    <p><strong>Content included from header.jsp:</strong></p>
    <!-- The content of header.jsp will be displayed here -->
</body>
</html>
