<%--
  Created by IntelliJ IDEA.
  User: Mark Nguyen
  Date: 5/10/2021
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Create New Student</h1>
    <form action="/student/create" method="post">
        <label>ID: </label> <input type="text" name="id">
        <label>Name: </label> <input type="text" name="name">
        <label>AGE: </label> <input type="text" name="age">
        <button type="submit">Submit</button>
    </form>
</body>
</html>
