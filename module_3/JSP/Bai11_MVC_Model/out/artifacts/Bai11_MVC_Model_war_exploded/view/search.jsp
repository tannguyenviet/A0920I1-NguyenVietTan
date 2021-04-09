<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/1/2021
  Time: 10:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--<form action="search" method="post">--%>
<%--    <div class="form-group">--%>
<%--        <label for="sel1">Select list:</label>--%>
<%--        <select class="form-control" name="1" id="sel1">--%>
<%--            <option value="1">Search By ID</option>--%>
<%--            <option value="2">2</option>--%>
<%--            <option>3</option>--%>
<%--            <option>4</option>--%>
<%--        </select>--%>
<%--    </div>--%>
<%--</form>--%>
<h1> Search Product By Name</h1>
<form action="search" method="post">
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">ID</label>
        <div class="col-sm-10">
            <input type="text" name="name" class="form-control" >
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Search</button>
</form>
</head>
<body>

</body>
</html>
