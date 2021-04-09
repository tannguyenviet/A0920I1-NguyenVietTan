<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/31/2021
  Time: 8:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="update" method="post">

    <input type="text" name="id"  value="${student.id}" readonly >
    <label>${student.id}</label><br>

    <input type="text" name="name" >
    <label>${student.name}</label><br>
    <input type="text" name="age" >
    <label>${student.age}</label><br>

    <input type="text" name="address" >
    <label>${student.address}</label><br>

    <input type="submit" value="Update">
</form>
</body>
</html>
