<%--
  Created by IntelliJ IDEA.
  User: Mark Nguyen
  Date: 5/9/2021
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Dictionary</h1>
    <form action="/dictionary" method="post">
        <label> Key: </label> <input name="key" value="${key}" type="text">
        <label>Value: </label> <input type="text" value="${value}">
        <button type="submit">Find</button>
    </form>
</body>
</html>
