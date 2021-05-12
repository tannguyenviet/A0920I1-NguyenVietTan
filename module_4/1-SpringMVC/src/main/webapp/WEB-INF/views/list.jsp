<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mark Nguyen
  Date: 5/9/2021
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <h1>List Customer</h1>
    <c:forEach var="c" items="${requestScope.listCustomer}">
        <tr>
            <td>
                <c:out value="${c.id}"/>
            </td>
            <td>
                <a href="info.jsp?id=${c.id}">${c.name}</a>
            </td>
            <td>
                <c:out value="${c.age}"/>
            </td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
