<%@page import="java.util.List"%>
<%@page import="com.jsp.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <% List<Employee> list = (List<Employee>) request.getAttribute("l"); %>
  
  <table border="2px">
  	<tr>
  		<th>ID</th>
  		<th>NAME</th>
  		<th>EMAIL</th>
  		<th>PASSWORD</th>
  		<th>GENDER</th>
  		<th>JOB</th>
  		<th>PHONE</th>
  		<th>SAL</th>
  	</tr>
  	<% for(Employee e : list){ %>
  		<tr>
  			<td><%= e.getId() %></td>
  			<td><%= e.getName() %></td>
  			<td><%= e.getEmail()%></td>
  			<td><%= e.getPassword()%></td>
  			<td><%= e.getGender()%></td>
  			<td><%= e.getJob()%></td>
  			<td><%= e.getPhone()%></td>
  			<td><%= e.getSal()%></td>
  		</tr>
  	<%}%>
  </table>
</body>
</html>