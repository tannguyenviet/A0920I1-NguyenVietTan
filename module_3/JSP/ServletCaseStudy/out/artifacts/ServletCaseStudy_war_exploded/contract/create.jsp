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
    <link rel="stylesheet" href="create.css">
    <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid main">
    <h1>Create New CONTRACT</h1>
    <form action="/contract?action=create" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">ID</label>
            <div class="col-sm-5">
                <input type="text" name="id" class="form-control" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">START DATE</label>
            <div class="col-sm-5">
                <input type="date" name="start_date" class="form-control" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">END DATE</label>
            <div class="col-sm-5">
                <input type="date" name="end_date" class="form-control" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">DEPOSIT</label>
            <div class="col-sm-5">
                <input type="text" name="deposit" class="form-control" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">TOTAL MONEY</label>
            <div class="col-sm-5">
                <input type="text" name="total_money" class="form-control" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">EMPLOYEE ID</label>
            <div class="col-sm-5">
                <select name="employee_id" class="form-control">
                    <c:forEach items="${typeEmployeeList}" var="typeEmployee" >
                        <option value="${typeEmployee.id}">${typeEmployee.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">CUSTOMER ID</label>
            <div class="col-sm-5">
            <select name="customer_id" class="form-control">
                <c:forEach items="${typeCustomerList}" var="typeCustomer" >
                    <option value="${typeCustomer.id}">${typeCustomer.name}</option>
                </c:forEach>
            </select>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">SERVICE ID</label>
            <div class="col-sm-5">
                <select name="service_id" class="form-control">
                    <c:forEach items="${typeServiceList}" var="typeService" >
                        <option value="${typeService.id}">${typeService.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Create</button>
        <button type="reset" class = "btn btn-primary">Cancel</button>
    </form>
</div>
</body>
</html>
