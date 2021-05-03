<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/1/2021
  Time: 9:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="/customer/create.css">
</head>
<body>
<div class="container-fluid main">
    <h1>Create New Service</h1>
    <form action="/customer?action=create" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">ID</label>
            <div class="col-sm-5">
                <input type="text" name="id" class="form-control" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">TYPE CUSTOMER</label>
            <div class="col-sm-5">
                <select name="type_id" class="form-control">
                    <c:forEach items="${typeCustomerList}" var="typeCustomer" >
                        <option value="${typeCustomer.id}">${typeCustomer.name}</option>
                    </c:forEach>
                </select>
            </div>

        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Name</label>
            <div class="col-sm-5">
                <input type="text" name="name" class="form-control" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Birthday</label>
            <div class="col-sm-5">
                <input type="date" name="birthday" class="form-control" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2" for="exampleFormControlSelect1">Gender</label>
            <div class="col-sm-5">
                <select name="gender" class="form-control" id="exampleFormControlSelect1">
                    <option value="0">Male</option>
                    <option value="1">Female</option>
                </select>
            </div>

        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">ID CARD</label>
            <div class="col-sm-5">
                <input type="text" name="id_card" class="form-control" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Phone</label>
            <div class="col-sm-5">
                <input type="text" name="phone" class="form-control" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Email</label>
            <div class="col-sm-5">
                <input type="email" name="email" class="form-control" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Address</label>
            <div class="col-sm-5">
                <input type="text" name="address" class="form-control" >
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Create</button>
        <button type="reset" class = "btn btn-primary">Cancel</button>
    </form>
</div>
</body>
</html>
