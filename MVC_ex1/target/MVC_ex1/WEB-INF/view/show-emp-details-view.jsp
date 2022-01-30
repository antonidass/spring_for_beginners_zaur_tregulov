<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>


<body>

<h2>YOU ARE WELCOME !!!</h2>
<br>
<br>

<%--Your name: ${param.employeeName}--%>
Your name : ${employee.name}
<form:errors path="name"/>
<br><br>
Your surname : ${employee.surname}
<br><br>
Your salary : ${employee.salary}




</body>
</html>