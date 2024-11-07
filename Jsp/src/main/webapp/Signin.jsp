<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% Object e =request.getAttribute("Emp"); %>
	 
	<% if(e!=null){ %>
	  <h1><% response.getWriter().print("Signed in Successfully"); %></h1>
	<%} 
	 else{%>
	<form action="signin">
		<label>Enter your name</label>
		<input type="text" name="name">
		<label>Enter your email</label>
		<input type="email" name="email">
		<label>Enter your password</label>
		<input type="password" name="pass">
		<label>Enter your gender</label>
		<input type="text" name="gender">
		<label>Enter your salary</label>
		<input type="text" name="sal">
		<label>Enter your job</label>
		<input type="text" name="job"
		<label>Enter your phone number</label>>
		<input type="number" name="phone">
		
		<input type="submit">
	<%} %>	
	</form>
</body>
</html>