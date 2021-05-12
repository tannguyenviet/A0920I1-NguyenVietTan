<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mark Nguyen
  Date: 5/10/2021
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <td>ID</td>
                <td>Tên</td>
                <td>Tuổi</td>
            </tr>
        </thead>
        <tbody>
                <c:forEach var="student" items="${students}">
                    <tr>
                        <td>${student.id}</td>
                        <td>${student.name}</td>
                        <td>${student.age}</td>
                        <td><a href="/student/edit/${student.id}">Edit</a></td>
                        <td><a href="/student/delete/${student.id}">Delete</a></td>
                    </tr>
                </c:forEach>
        </tbody>
    </table>
    <a href="/student/create">Create New Student</a>
</body>
</html>
