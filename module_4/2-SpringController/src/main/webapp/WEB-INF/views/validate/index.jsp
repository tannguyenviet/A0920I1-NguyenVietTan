<%--
  Created by IntelliJ IDEA.
  User: Mark Nguyen
  Date: 5/12/2021
  Time: 6:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Trang chủ</h1>
    <h2>${message}</h2>
    <form action="/validate" method="post">
        <label>Email</label><input type="text" name="email">


        <button type="submit">Submit</button>
    </form>
</body>
</html>
