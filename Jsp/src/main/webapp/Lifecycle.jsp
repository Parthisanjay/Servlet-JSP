<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%!public void jspInit(){
		System.out.println("Jsp init method");
	}
	%>
	
	<%! public void jspDestroy(){
		System.out.println("Jsp Destroy method");
	}
	%>
	
	<% System.out.println("Jsp Service method"); %>
</body>
</html>