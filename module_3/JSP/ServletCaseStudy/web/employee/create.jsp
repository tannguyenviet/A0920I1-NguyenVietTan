<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<%--    <script src="http://code.jquery.com/jquery-latest.min.js"></script>--%>
    <link rel="stylesheet" href="/employee/create.css">

</head>

<body>
<nav class="navbar navbar-expand-sm bg-info navbar-dark justify-content-between ">
    <!-- Brand -->
    <div>
        <!-- Links -->
        <ul class="navbar-nav ml-5 ">
            <li class="nav-item">
                <a class="nav-link" href="#">Home</a>
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
                    Dropdown link
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
        <div class="" id="body">
            <div class="main">
                <h1>Create New Employee</h1>
                <form name="create" action="/employee?action=create" onsubmit="validateForm()" method="post">
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
                        <label class="col-sm-2 col-form-label">BIRTHDAY</label>
                        <div class="col-sm-5">
                            <input type="date" name="birthday" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">ID CARD</label>
                        <div class="col-sm-5">
                            <input type="text" name="id_card" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">SALARY</label>
                        <div class="col-sm-5">
                            <input type="text" name="salary" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">PHONE</label>
                        <div class="col-sm-5">
                            <input type="text" name="phone" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">EMAIL</label>
                        <div class="col-sm-5">
                            <input type="text" name="email" class="form-control" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">POSITION ID</label>
                        <div class="col-sm-5">
                            <select name="position_id" class="form-control">
                                <c:forEach items="${typePositionList}" var="typePosition" >
                                    <option value="${typePosition.id}">${typePosition.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">EDUCATION ID</label>
                        <div class="col-sm-5">
                            <select name="education_id" class="form-control">
                                <c:forEach items="${typeEducationDegreeList}" var="typeEducation" >
                                    <option value="${typeEducation.id}">${typeEducation.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">DIVISION ID</label>
                        <div class="col-sm-5">
                            <select name="division_id" class="form-control">
                                <c:forEach items="${typeDivisionList}" var="typeDivision" >
                                    <option value="${typeDivision.id}">${typeDivision.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 col-form-label">USERNAME</label>
                        <div class="col-sm-5">
                            <select name="username" class="form-control">
                                <c:forEach items="${typeUserNameList}" var="typeUsername" >
                                    <option value="${typeUsername.username}">${typeUsername.username}</option>
                                </c:forEach>
                            </select>
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
<script src="/validateData.js"></script>
<script>
    function validateForm() {
        let id = document.forms["create"]["id"].value;
        let id_card = document.forms["create"]["id_card"].value;
        let salary = document.forms["create"]["salary"].value;
        let phone = document.forms["create"]["phone"].value;
        let email = document.forms["create"]["email"].value;
        let position_id = document.forms["create"]["position_id"].value;
        let education_id = document.forms["create"]["education_id"].value;
        let division_id = document.forms["create"]["division_id"].value;

        if(!validateNumber(id)){
            alert("Id Error!");
            return false;
        }
        if(!validateNumber(id_card)){
            alert("ID Card Error!");
            return false;
        }
        if(!validateEmail(email)){
            alert("Email Error");
            return false;
        }
        if(!validateNumber(salary)){
            alert("Salary Error!");
            return false;
        }
        if(!validateNumber(phone)){
            alert("Phone Error!");
            return false;
        }
        if(!validateNumber(position_id)){
            alert("position_id Error!");
            return false;}

        if(!education_id(education_id)){
            alert("number_of_floors Error!");
            return false;
        }
        if(!education_id(division_id)){
            alert("division_id Error!");
            return false;
        }
    }

</script>
</body>

</html>



