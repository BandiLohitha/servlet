<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <table border="2px">
  <tr>
  <th>EID</th>
  <th>ENAME</th>
  <th>ESAL</th>
  </tr>
    
    
    <c:forEach var="e" items="${emps}">
    <tr>
    <td>${e.getEid()}</td>
     <td>${e.getEname()}</td>
      <td>${e.getEsal()}</td>
    
    </tr>
    </c:forEach>
  </table>
</body>
</html>