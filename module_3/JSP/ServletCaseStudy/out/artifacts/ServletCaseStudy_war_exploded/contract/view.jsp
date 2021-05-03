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
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.2/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/contract/create.css">
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
                    Contract Detail
                </a>
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
            <div class="container-fluid main">
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">START DATE</th>
                        <th scope="col">END DATE</th>
                        <th scope="col">DEPOSIT</th>
                        <th scope="col">TOTAL MONEY</th>
                        <th scope="col">EMPLOYEE</th>
                        <th scope="col">CUSTOMER</th>
                        <th scope="col">SERVICE</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${listContract}" var="contract" >
                        <tr>
                            <td>${contract.id}</td>
                            <td>${contract.start_date}</td>
                            <td>${contract.end_date}</td>
                            <td>${contract.deposit}</td>
                            <td>${contract.contract_total_money}</td>
                            <td>${contract.employee_id}</td>
                            <td>${contract.customer_id}</td>
                            <td>${contract.service_id}</td>
                            <td><a class="btn btn-info " id="btn-detail${contract.id} " name="detail" href="/contract?action=detail&id=${contract.id}" >Detail</a></td>
                            <td><a class="btn btn-primary" id="btn-edit${contract.id} "name="edit" href="/contract?action=edit&id=${contract.id}" >Edit</a></td>
                            <td><a class="btn btn-danger" type="button" data-toggle="modal" data-target="#modal${contract.id}" id="btn-delete${contract.id}" name="delete" >Delete</a></td>
                            <div class="modal fade" id="modal${contract.id}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            Do you want to delete Contract Id : ${contract.id}
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                            <a  class="btn btn-primary" href="/contract?action=delete&id=${contract.id}" role="button">Save changes</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div class="d-flex">
                    <div class="mr-5">
                        <a href="/contract?action=create" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Create New contract</a>
                        <a href="/contract?action=search" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Search</a>
                    </div>
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

</body>
</html>



