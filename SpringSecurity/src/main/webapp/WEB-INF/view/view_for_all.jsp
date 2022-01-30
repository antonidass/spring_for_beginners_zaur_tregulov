<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: akrik
  Date: 29.01.2022
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Viewe for all emps</title>
</head>
<body>

<h3>Info for all employees</h3>

<security:authorize access="hasRole('HR')">
    <input type="button" value="salary" onclick="window.location.href = 'hr_info'">
    OnlyForHR_STAFF!
</security:authorize>

<security:authorize access="hasRole('MANAGER')">
    <input type="button" value="perfomance" onclick="window.location.href = 'manager_info'">
    Only for managers!
</security:authorize>

</body>
</html>
