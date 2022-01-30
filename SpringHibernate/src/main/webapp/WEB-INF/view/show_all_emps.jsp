<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: akrik
  Date: 29.01.2022
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show_all_emps</title>
</head>
<body>

<h3>All Employees</h3>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <c:forEach items="${allEmps}" var="employee">
        <c:url var="update_button" value="/update_emp">
            <c:param name="empId" value="${employee.id}"/>
        </c:url>
        <c:url var="delete_button" value="/delete_emp">
            <c:param name="empId" value="${employee.id}"/>
        </c:url>

        <tr>
            <td>${employee.name}</td>
            <td>${employee.surname}</td>
            <td>${employee.department}</td>
            <td>${employee.salary}</td>
            <td>
                <button name="update" onclick="window.location.href='${update_button}'">Update</button>
                <button name="delete" onclick="window.location.href='${delete_button}'">Delete</button>
            </td>
        </tr>
    </c:forEach>
</table>

<button name="addEmp" onclick="window.location.href = 'add_new_emp'">
    Add
</button>

</body>
</html>
