<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="e" class="com.org.Employee">
<jsp:setProperty property="id" name="e" value="102"/>
<jsp:setProperty property="name" name="e" value="SMITH"/>
<jsp:setProperty property="sal" name="e"value="800"/>
<jsp:getProperty property="id" name="e"/><br>
<jsp:getProperty property="name" name="e"/><br>
<jsp:getProperty property="sal" name="e"/>

</jsp:useBean>
</body>
</html>