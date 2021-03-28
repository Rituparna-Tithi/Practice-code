<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">



<center>
		<h1>Employee Registration</h1>
        <h2>
        	<a href="new">Add Employee</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="list">List All Users</a>

        </h2>
	</center>
    <div align="center">
		<c:if test="${employee != null}">
			<form action="update" method="post">
        </c:if>
        <c:if test="${employee == null}">
			<form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
            	<h2>
            		<c:if test="${employee != null}">
            			Edit User
            		</c:if>
            		<c:if test="${employee == null}">
            			Add New Employee
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${employee != null}">
        			<input type="hidden" name="id" value="<c:out value='${employee.id}' />" />
        		</c:if>            
            <tr>
                <th> FirstName: </th>
                <td>
                	<input type="text" name="firstName" size="45"
                			value="<c:out value='${employee.firstName}' />"
                		/>
                </td>
            </tr>
            <tr>
                <th> LastName </th>
                <td>
                	<input type="text" name="lastName" size="45"
                			value="<c:out value='${employee.lastName}' />"
                	/>
                </td>
            </tr>
            <tr>
                <th>EmailAddress: </th>
                <td>
                	<input type="text" name="emailAddress" size="15"
                			value="<c:out value='${employee.emailAddress}' />"
                	/>
                </td>
            </tr>
            
            <tr>
                <th> Company: </th>
                <td>
                	<input type="text" name="company" size="45"
                			value="<c:out value='${employee.company}' />"
                		/>
                </td>
            </tr>
            <tr>
                <th>PhysicalAddress: </th>
                <td>
                	<input type="text" name="physicalAddress" size="45"
                			value="<c:out value='${employee.physicalAddress}' />"
                		/>
                </td>
            </tr>
            <tr>
                <th>DateOfBirth: </th>
                <td>
                	<input type="text" name="dateOfBirth" size="45"
                			value="<c:out value='${employee.dateOfBirth}' />"
                		/>
                </td>
           <tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Save" />
            	</td>
            </tr>
           
            
        </table>
        
    </div>	

</body>
</html>