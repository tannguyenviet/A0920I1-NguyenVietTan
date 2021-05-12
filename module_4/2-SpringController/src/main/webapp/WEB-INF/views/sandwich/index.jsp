<%--
  Created by IntelliJ IDEA.
  User: Mark Nguyen
  Date: 5/12/2021
  Time: 6:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Sand Wich Condiments</h1>
    <form action="/sandwich" method="post">
        <input type="checkbox" name="comdiment" value="lecttuce">
        <input type="checkbox" name="comdiment" value="tomato">
        <input type="checkbox" name="comdiment" value="mustard">
        <input type="checkbox" name="comdiment" value="sprouts">
        <button type="submit">Submit</button>
    </form>
</body>
</html>
