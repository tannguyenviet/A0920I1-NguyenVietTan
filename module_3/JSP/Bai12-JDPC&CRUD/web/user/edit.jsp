<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/5/2021
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <table border="1" cellpadding="5">
        <caption>
            <h2>Edit User</h2>
        </caption>
        <tr>
            <th>User Id:</th>
            <td>
                ${id}
                <input readonly type="text" name="id" id="i" size="45" value="${user.id}"/>
            </td>
        </tr>
        <tr>
            <th>User Name:</th>
            <td>
                <input type="text" name="name" id="name" size="45"/>
            </td>
        </tr>
        <tr>
            <th>User Email:</th>
            <td>
                <input type="text" name="email" id="email" size="45"/>
            </td>
        </tr>
        <tr>
            <th>Country:</th>
            <td>
                <input type="text" name="country" id="country" size="15"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Save"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
