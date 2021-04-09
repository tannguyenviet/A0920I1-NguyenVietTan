<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/31/2021
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="create">Create New Student</a>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Address</th>

        </tr>
<%--        <p>${studentList.size()}</p>--%>
        <c:forEach items="${studentList}" var="student">
            <tr>
                <td>${student.getId()}</td>
                <td>${student.getName()}</td>
                <td>${student.getAge()}</td>
                <td>${student.getAddress()}</td>
                <td><a href="delete?id=${student.id}">Delete</a></td>
                <td><a href="update?id=${student.id}">Update</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
