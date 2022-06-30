<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Redirect Page</title>
</head>
<body>
	<%
		request.setAttribute("id", "abcd");
		request.setAttribute("pw", "8888");	
		
		response.sendRedirect("RequestTest2");	// 새로 request 객체를 생성해서 해당 클래스(다른 페이지)로 전달 => null값이 됨
	%>
</body>
</html>