
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/12/2021
  Time: 8:06 PM
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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<%--    <script src="http://code.jquery.com/jquery-latest.min.js"></script>--%>
<%--    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>--%>
<%--    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.2/umd/popper.min.js"></script>--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"></script>--%>

<%--    <script src="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap4.min.js"></script>--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>--%>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css">
    <script src="../jquery/jquery-3.5.1.min.js"></script>
    <script src="../bootstrap413/js/popper.min.js"></script>
    <script src="../datatables/js/jquery.dataTables.min.js"></script>
    <script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
    <script src="../bootstrap413/js/bootstrap.min.js"></script>
    <script src="../bootstrap413/js/bootstrap.bundle.js"></script>
    <link rel="stylesheet" href="/employee/create.css">
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
                <a class="nav-link btn " id="btn-customer" href="/customer" >Customer</a>
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
    <div class="col-2 item-left p-3">
        <ul style="list-style: none">
            <li><a class="btn btn-primary mb-2" href="/contract?action=cus-con" role="button">List Customer Vip</a></li>
            <li><a class="btn btn-primary mb-2" href="/contract?action=cus-con" role="button">List Customer Vip</a></li>
            <li><a class="btn btn-primary mb-2" href="/contract?action=cus-con" role="button">List Customer Vip</a></li>

        </ul>
    </div>
    <div class="col-10" id="content">
        <div class="" id="body">
            <table class="table table-striped" id="employee">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">NAME</th>
                    <th scope="col">BIRTHDAY</th>
                    <th scope="col">CARD</th>
                    <th scope="col">SALARY</th>
                    <th scope="col">PHONE</th>
                    <th scope="col">POSITION</th>
                    <th scope="col">EDUCATION</th>
                    <th scope="col">DIVISION</th>
                    <th scope="col">USERNAME</th>
                    <th scope="col"></th>
                    <th scope="col"></th>

                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listEmployee}" var="employee" >
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.name}</td>
                        <td>${employee.birthday}</td>
                        <td>${employee.id_card}</td>
                        <td>${employee.salary}</td>
                        <td>${employee.phone}</td>
                        <td>
                            <c:choose>
                                <c:when test = "${employee.position_id == 1}">
                                    Lễ Tân
                                </c:when>
                                <c:when test = "${employee.position_id ==2}">
                                    Phục Vụ
                                </c:when>
                                <c:when test = "${employee.position_id ==3}">
                                    Chuyên Viên
                                </c:when>
                                <c:when test = "${employee.position_id ==4}">
                                    Giám sát
                                </c:when>
                                <c:when test = "${employee.position_id ==5}">
                                    Quản lí
                                </c:when>
                                <c:when test = "${employee.position_id ==6}">
                                    Giám Đốc
                                </c:when>
                                <c:otherwise>
                                    UNDEFINE
                                </c:otherwise>
                            </c:choose>

                        </td>
                        <td>
                            <c:choose>
                                <c:when test = "${employee.education_id == 1}">
                                    Trung Cấp
                                </c:when>
                                <c:when test = "${employee.education_id ==2}">
                                    Cao Đẳng
                                </c:when>
                                <c:when test = "${employee.education_id ==3}">
                                    Đại Học
                                </c:when>
                                <c:when test = "${employee.education_id ==4}">
                                    Sau Đại Học
                                </c:when>
                                <c:otherwise>
                                    UNDEFINE
                                </c:otherwise>
                            </c:choose>
                        </td>
                        <td>
                            <c:choose>
                                <c:when test = "${employee.division_id == 1}">
                                    Sale Marketing
                                </c:when>
                                <c:when test = "${employee.division_id ==2}">
                                    Hành Chính
                                </c:when>
                                <c:when test = "${employee.division_id ==3}">
                                    Phục Vụ
                                </c:when>
                                <c:when test = "${employee.division_id ==4}">
                                    Quản lí
                                </c:when>
                                <c:otherwise>
                                    UNDEFINE
                                </c:otherwise>
                            </c:choose>
                        </td>

                        <td>${employee.username }</td>
                        <td><a class="btn btn-primary" id="btn-edit${employee.id} "name="edit" href="/employee?action=edit&id=${employee.id}" >Edit</a></td>
                        <td><a class="btn btn-danger" type="button" data-toggle="modal" data-target="#modal${employee.id}" id="btn-delete${employee.id}" name="delete">Delete</a></td>

                            <div class="modal fade" id="modal${employee.id}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            Do you want to delete Service : ${employee.id}
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                            <a  class="btn btn-primary" href="/employee?action=delete&id=${employee.id}" role="button">Save changes</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="d-flex">
                <div class="mr-5 mb-2">
                    <a href="/employee?action=create" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Create New employee</a>
                    <a href="/employee?action=search" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Search</a>
                </div>

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
    $(document).ready(function () {
        $('#employee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        })
    })
</script>
</body>

</html>


