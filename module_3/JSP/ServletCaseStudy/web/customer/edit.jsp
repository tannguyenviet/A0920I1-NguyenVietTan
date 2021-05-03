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
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body id="body-edit">
<div class="container-fluid main" id="main">
    <h1>Edit Product</h1>
    <form action="/customer?action=update" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">ID</label>
            <div class="col-sm-5">
                <input readonly type="text" name="id" class="form-control" value="${customer.id}">
            </div>
        </div>

        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Name</label>
            <div class="col-sm-5">
                <input type="text" name="name" class="form-control" value="${customer.name}">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Birthday</label>
            <div class="col-sm-5">
                <input type="date" name="birthday" class="form-control" value="${customer.birthday}">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Birthday</label>
            <div class="col-sm-5">
                <input type="date" name="birthday" class="form-control" value="${customer.birthday}">
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
                <input type="text" name="id_card" class="form-control" value="${customer.id_card}" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Phone</label>
            <div class="col-sm-5">
                <input type="text" name="phone" class="form-control" value="${customer.phone}">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Email</label>
            <div class="col-sm-5">
                <input type="email" name="email" class="form-control" value="${customer.email}">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label ">Address</label>
            <div class="col-sm-5">
                <input type="text" name="address" class="form-control" value="${customer.address}">
            </div>
        </div>
        <button type="button" class="btn btn-primary " id="save">Save</button>
        <button type="reset" class = "btn btn-primary">Cancel</button>
    </form>
    <script  >
        $(document).ready(function () {
            $('#save').click(function () {
                let id = document.getElementsByName('id');
                console.log(id);
                let type_id = document.getElementsByName('type_id');
                let name = document.getElementsByName('name').values();
                let birthday = document.getElementsByName('birthday');
                let gender = document.getElementsByName('gender');
                let id_card = document.getElementsByName('id_card');
                let phone = document.getElementsByName('phone');
                let email = document.getElementsByName('email');
                let address = document.getElementsByName('address');
                $.ajax({
                    type:'POST',
                    data:{
                        action:'update',
                        id:id,
                        type_id:type_id,
                        name:name,
                        birthday:birthday,
                        gender:gender,
                        id_card:id_card,
                        phone:phone,
                        email:email,
                        address:address
                    },
                    url:'customer',
                    success :function (result) {
                        $('#main').html(result);
                    }
                })
            })

        })
    </script>
</div>
</body>
</html>
