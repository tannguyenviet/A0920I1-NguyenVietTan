<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/1/2021
  Time: 8:56 PM
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
        <th scope="col">ID</th>
        <th scope="col">NAME</th>
        <th scope="col">PRICE</th>
        <th scope="col">DESCRIPTION</th>
        <th scope="col">PRODUCER</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listProduct}" var="product" >
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getProducer()}</td>
            <td><a href="edit?id=${product.id}">Edit</a></td>
            <td><a href="delete?id=${product.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="d-flex">
    <div class="mr-5">
        <a href="create" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Create New Product</a>
        <a href="search" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Search</a>
    </div>
    <div class="float-right ml-5">
        <form action="sort" method="get">
            <div class="form-group">
                <label for="sel1"> <strong>Select Type Sort</strong></label>
                <select class="form-control" name="option" id="sel1">
                    <option value="1">Name</option>
                    <option value="2">Price</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary">Sort</button>
        </form>

    </div>

</div>


</body>
</html>
