<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mark Nguyen
  Date: 5/14/2021
  Time: 7:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <form:form action="/createMail" method="post" modelAttribute="mail" >
        <table>
            <tr>
                <td><form:label path="language">Languages </form:label></td>
                <td><form:select path="language" items="${languages}"  /></td>
            </tr>
            <tr>
                <td><form:label path="pageSize">Page Side: </form:label></td>
                <td><form:select path="pageSize" items="${pagesizes}"/></td>
            </tr>
            <tr>
                <td><form:label path="enableSpamFilter">Spam Filter: </form:label></td>
                <td><form:checkbox path="enableSpamFilter" value="true"/>Enable spam filter</td>
            </tr>
            <tr>
                <td><form:label path="signature">Signature: </form:label></td>
                <td><form:textarea path="signature"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/>Submit</td>
            </tr>
        </table>
    </form:form>
</head>
<body>

</body>
</html>
