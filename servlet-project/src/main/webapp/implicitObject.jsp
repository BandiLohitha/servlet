<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=request.getClass() %>
<%=response.getClass() %>
<%=out.getClass() %>
<%=session.getClass() %>
<%
   out.println("hii");
out.println("hello");
%>
</body>
</html>