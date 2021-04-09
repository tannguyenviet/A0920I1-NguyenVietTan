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
</head>
<body>
<h1>Create New Product</h1>
<form action="create" method="post">
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">ID</label>
        <div class="col-sm-10">
            <input type="text" name="id" class="form-control" >
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">NAME</label>
        <div class="col-sm-10">
            <input type="text" name="name" class="form-control" >
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">PRICE</label>
        <div class="col-sm-10">
            <input type="text" name="price" class="form-control" >
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">DESCRIPTION</label>
        <div class="col-sm-10">
            <input type="text" name="description" class="form-control" >
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">PRODUCER</label>
        <div class="col-sm-10">
            <input type="text" name="producer" class="form-control" >
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Create</button>
    <button type="reset" class = "btn btn-primary">Cancel</button>
</form>
</body>
</html>
