<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%= request.getClass() %><br>
<%= response.getClass() %><br>
<%= out.getClass() %><br>
<%= session.getClass() %><br>
<%  
 out.println("hii");
 out.println("hello");
%>
</body>
</html>