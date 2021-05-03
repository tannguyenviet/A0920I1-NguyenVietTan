<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
 Created by IntelliJ IDEA.
 User: ADMIN
 Date: 4/1/2021
 Time: 9:14 PM
 To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/service/create.css">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="/validateData.js"></script>
</head>

<body>
<nav class="navbar navbar-expand-sm bg-info navbar-dark justify-content-between ">
    <!-- Brand -->
    <div>
        <!-- Links -->
        <ul class="navbar-nav ml-5 ">
            <li class="nav-item">
                <a class="nav-link" href="../index.jsp">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/employee">Employee</a>
            </li>
            <%--            href="/customer?action=view"--%>
            <li class="nav-item">
                <a class="nav-link btn " id="btn-customer" >Customer</a>
            </li>
            <li class="nav-item">
                <a class="nav-link btn" id="btn-service" href="/service">Service</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/contract ">Contract</a>
            </li>
            <!-- Dropdown -->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                    Contact Detail
                </a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="#">Link 1</a>
                    <a class="dropdown-item" href="#">Link 2</a>
                    <a class="dropdown-item" href="#">Link 3</a>
                </div>
            </li>
        </ul>
    </div>

    <form class="form-inline mr-5" action="/action_page.php">
        <input class="form-control mr-sm-2" type="text" placeholder="Search">
        <button class="btn btn-success" type="submit">Search</button>
    </form>
</nav>
<div class="row content">
    <div class="col-2 item-left">
        <ul>
            <li>ItemOne</li>
            <li>ItemOne</li>
            <li>ItemOne</li>
        </ul>
    </div>
    <div class="col-10" id="content">
        <div class="m-3x" id="body">
            <div class="container-fluid main">
                <h1>Create New Service</h1>
                <form name="create" action="/service?action=create"  onsubmit="return validateForm()" method="post">
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">ID</label>
                        <div class="col-sm-5">
                            <input type="text" name="id" class="form-control" >
                        </div>

                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">NAME</label>
                        <div class="col-sm-5">
                            <input type="text" name="name" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">AREA</label>
                        <div class="col-sm-5">
                            <input type="text" name="area" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">SERVICE COST</label>
                        <div class="col-sm-5">
                            <input type="text" name="service_cost" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">MAX PEOPLE</label>
                        <div class="col-sm-5">
                            <input type="text" name="service_max_people" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">RENT TYPE ID</label>
                        <div class="col-sm-5">
                            <select name="rent_type_id" class="form-control">
                                <c:forEach items="${typeRentList}" var="typeRent" >
                                    <option value="${typeRent.id}">${typeRent.name}</option>
                                </c:forEach>
                            </select>
                        </div>

                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">SERVICE TYPE ID</label>
                        <div class="col-sm-5">
                            <select name="service_type_id" class="form-control">
                                <c:forEach items="${typeServiceList}" var="typeService" >
                                    <option value="${typeService.id}">${typeService.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">STANDARD ROOM</label>
                        <div class="col-sm-5">
                            <input type="text" name="standard_room" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">DESCRIPTION</label>
                        <div class="col-sm-5">
                            <input type="text" name="description_other_convenience" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">POOL AREA</label>
                        <div class="col-sm-5">
                            <input type="text" name="pool_area" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">NUMBER OF FLOOR</label>
                        <div class="col-sm-5">
                            <input type="text" name="number_of_floors" class="form-control" >
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary">Create</button>
                    <button type="reset" class = "btn btn-primary">Cancel</button>

                </form>

            </div>
        </div>
    </div>

</div>
<footer class="text-center text-white" style="background-color: #caced1;">
    <!-- Grid container -->
    <div class="container p-4">
        <!-- Section: Images -->
        <section class="">
            <div class="row">
                <div class="col-lg-2 col-md-12 mb-4 mb-md-0">
                    <div class="bg-image hover-overlay ripple shadow-1-strong rounded" data-ripple-color="light">
                        <img src="https://mdbootstrap.com/img/new/fluid/city/113.jpg" class="w-100" />
                        <a href="#!">
                            <div class="mask" style="background-color: rgba(251, 251, 251, 0.2);"></div>
                        </a>
                    </div>
                </div>
                <div class="col-lg-2 col-md-12 mb-4 mb-md-0">
                    <div class="bg-image hover-overlay ripple shadow-1-strong rounded" data-ripple-color="light">
                        <img src="https://mdbootstrap.com/img/new/fluid/city/111.jpg" class="w-100" />
                        <a href="#!">
                            <div class="mask" style="background-color: rgba(251, 251, 251, 0.2);"></div>
                        </a>
                    </div>
                </div>
                <div class="col-lg-2 col-md-12 mb-4 mb-md-0">
                    <div class="bg-image hover-overlay ripple shadow-1-strong rounded" data-ripple-color="light">
                        <img src="https://mdbootstrap.com/img/new/fluid/city/112.jpg" class="w-100" />
                        <a href="#!">
                            <div class="mask" style="background-color: rgba(251, 251, 251, 0.2);"></div>
                        </a>
                    </div>
                </div>
                <div class="col-lg-2 col-md-12 mb-4 mb-md-0">
                    <div class="bg-image hover-overlay ripple shadow-1-strong rounded" data-ripple-color="light">
                        <img src="https://mdbootstrap.com/img/new/fluid/city/114.jpg" class="w-100" />
                        <a href="#!">
                            <div class="mask" style="background-color: rgba(251, 251, 251, 0.2);"></div>
                        </a>
                    </div>
                </div>
                <div class="col-lg-2 col-md-12 mb-4 mb-md-0">
                    <div class="bg-image hover-overlay ripple shadow-1-strong rounded" data-ripple-color="light">
                        <img src="https://mdbootstrap.com/img/new/fluid/city/115.jpg" class="w-100" />
                        <a href="#!">
                            <div class="mask" style="background-color: rgba(251, 251, 251, 0.2);"></div>
                        </a>
                    </div>
                </div>
                <div class="col-lg-2 col-md-12 mb-4 mb-md-0">
                    <div class="bg-image hover-overlay ripple shadow-1-strong rounded" data-ripple-color="light">
                        <img src="https://mdbootstrap.com/img/new/fluid/city/116.jpg" class="w-100" />
                        <a href="#!">
                            <div class="mask" style="background-color: rgba(251, 251, 251, 0.2);"></div>
                        </a>
                    </div>
                </div>
            </div>
        </section>
        <!-- Section: Images -->
    </div>
    <!-- Grid container -->

    <!-- Copyright -->
    <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
        © 2020 Copyright:
        <a class="text-white" href="https://mdbootstrap.com/">MDBootstrap.com</a>
    </div>
    <!-- Copyright -->
</footer>

<script>
    function validateForm() {
        let id = document.forms["create"]["id"].value;
        let name = document.forms["create"]["name"].value;
        let area = document.forms["create"]["area"].value;
        let service_cost = document.forms["create"]["service_cost"].value;
        let service_max_people = document.forms["create"]["service_max_people"].value;
        let rent_type_id = document.forms["create"]["rent_type_id"].value;
        let service_type_id = document.forms["create"]["service_type_id"].value;
        let standard_room = document.forms["create"]["standard_room"].value;
        let description_other_convenience = document.forms["create"]["description_other_convenience"].value;
        let pool_area = document.forms["create"]["pool_area"].value;
        let number_of_floors = document.forms["create"]["number_of_floors"].value;
        if(!validateNumber(id)){
            alert("Id Error!");
            return false;
        }
        if(!validateDecimalNumber(area)){
            alert("Area Error!");
            return false;
        }
        if(!validateNumber(service_cost)){
            alert("Service Cost Error!");
            return false;
        }
        if(!validateNumber(service_max_people)){
            alert("Max People Service Error!");
            return false;
        }
        if(!validateNumber(rent_type_id)){
            alert("Rent Type ID Error!");
            return false;
        }
        if(!validateNumber(service_type_id)){
            alert("type_id Error!");
            return false;}
        if(!validateDecimalNumber(pool_area)){
            alert("pool_area Error!");
            return false;
        }
        if(!validateNumber(number_of_floors)){
            alert("number_of_floors Error!");
            return false;
        }
    }

</script>
<%--<script  >--%>
<%--    $(document).ready(function () {--%>
<%--        $('#btn-customer').click(function () {--%>
<%--            $.ajax({--%>
<%--                type:'GET',--%>
<%--                url:'customer',--%>
<%--                success :function (result) {--%>
<%--                    $('#body').html(result);--%>
<%--                }--%>
<%--            })--%>
<%--        })--%>

<%--    })--%>
<%--</script>--%>
</body>

</html>


