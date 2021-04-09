<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/31/2021
  Time: 6:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
    <h1>Result: </h1>
    <p>operator: ${operator}</p>
    <c:choose>
        <c:when test="${operator=='+'}">
            <p>${first} + ${sec} = ${first+sec} </p>
        </c:when>
        <c:when test="${operator=='-'}">
            <p>${first} - ${sec} = ${first-sec} </p>
        </c:when>
        <c:when test="${operator=='*'}">
            <p>${first} * ${sec} = ${first*sec} </p>
        </c:when>
        <c:when test="${operator=='/'}">
            <p>${first} / ${sec} = ${first/sec} </p>
        </c:when>
    </c:choose>

</body>
</html>
