<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/31/2021
  Time: 1:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Tên</th>
        <th scope="col">Ngày Sinh</th>
        <th scope="col">Địa chỉ</th>
        <th scope="col">Ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listCustomer}" var="customer" >
    <tr>
            <td>${customer.getName()}</td>
            <td>${customer.getDate()}</td>
            <td>${customer.getAddress()}</td>
            <td><img style="width: 50px" height="100px" src="./img/2.png"></td>
    </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
