<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href ="/"></a>

<center>
		<h1>Employee Registration</h1>
        <h2>
        	<a href="new">Add New Employee</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="list">List All Users</a>

        </h2>
	</center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Users</h2></caption>
            <tr>
                <th>ID</th>
                <th>FirstName</th>
                <th>LastName</th>
                <th>EmailAddress</th>
                <th>Company</th>
                <th>PhysicalAddress</th>
                <th>DateOfBirth</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="employee" items="${listEmployee}">
                <tr>
                    <td><c:out value="${employee.id}" /></td>
                    <td><c:out value="${employee.firstName}" /></td>
                    <td><c:out value="${employee.lastName}" /></td>
                    <td><c:out value="${employee.emailAddress}" /></td>
                    <td><c:out value="${employee.company}" /></td>
                    <td><c:out value="${employee.physicalAddress}" /></td>
                    <td><c:out value="${employee.dateOfBirth}" /></td>
                    <td>
                    	<a href="edit?id=<c:out value="${employee.id}" />">Edit</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a href="delete?id=<c:out value="${employee.id}" />">Delete</a>                    	
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>	







</body>
</html>