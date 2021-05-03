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
    <h1>Edit Employee</h1>
    <form action="/employee?action=update" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">ID</label>
            <div class="col-sm-5">
                <input readonly type="text" name="id" class="form-control " value="${employee.id}" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">NAME</label>
            <div class="col-sm-5">
                <input  type="text" name="name" class="form-control " value="${employee.name}" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">BIRTHDAY</label>
            <div class="col-sm-5">
                <input type="date" name="birthday" class="form-control "value="${employee.birthday}" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">ID CARD</label>
            <div class="col-sm-5">
                <input type="text" name="id_card" class="form-control" value="${employee.id_card}">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">SALARY</label>
            <div class="col-sm-5">
                <input type="text" name="salary" class="form-control" value="${employee.salary}" >
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">PHONE</label>
            <div class="col-sm-5">
                <input type="text" name="phone" class="form-control" value="${employee.phone}">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">EMAIL</label>
            <div class="col-sm-5">
                <input type="text" name="email" class="form-control" value="${employee.email} ">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">POSITION ID</label>
            <div class="col-sm-5">
                <select name="position_id" class="form-control"  value="${employee.position_id} ">
                    <c:forEach items="${typePositionList}" var="typePosition" >
                        <c:choose>
                            <c:when test="${typePosition.id==employee.position_id}">
                                <option selected value="${typePosition.id}">${typePosition.name}</option>
                            </c:when>
                            <c:otherwise>
                                <option  value="${typePosition.id}">${typePosition.name}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">EDUCATION ID</label>
            <div class="col-sm-5">
                <select name="education_id" class="form-control"  value="${employee.education_id} ">
                    <c:forEach items="${typeEducationDegreeList}" var="typeEducation" >
                        <c:choose>
                            <c:when test="${typeEducation.id==employee.education_id}">
                                <option selected value="${typeEducation.id}">${typeEducation.name}</option>
                            </c:when>
                            <c:otherwise>
                                <option  value="${typeEducation.id}">${typeEducation.name}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">DIVISION ID</label>
            <div class="col-sm-5">
                <select name="division_id" class="form-control" value="${employee.division_id} ">
                    <c:forEach items="${typeDivisionList}" var="typeDivision" >
                        <c:choose>
                            <c:when test="${typeDivision.id==employee.division_id}">
                                <option selected value="${typeDivision.id}">${typeDivision.name}</option>
                            </c:when>
                            <c:otherwise>
                                <option  value="${typeDivision.id}">${typeDivision.name}</option>
                            </c:otherwise>
                        </c:choose>

                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">USERNAME</label>
            <div class="col-sm-5">
                <select name="username" class="form-control" value="${employee.username} ">
                    <c:forEach items="${typeUserNameList}" var="typeUsername" >
                        <c:choose>
                            <c:when test="${employee.username==typeUsername.username}">
                                <option selected value="${typeUsername.username}">${typeUsername.username}</option>
                            </c:when>
                            <c:otherwise>
                                <option value="${typeUsername.username}">${typeUsername.username}</option>
                            </c:otherwise>
                        </c:choose>

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
