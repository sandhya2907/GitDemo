<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO PRODUCT DATA</h3>
<table border="1">
<tr>
<th>ID</th>
<th>NAME</th>
<th>ADDRESS</th>
<th colspan="2">OPERATIONS </th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td><c:out value="${ob.id}"></c:out>
<td><c:out value="${ob.ename}"></c:out>
<td><c:out value="${ob.eaddr}"></c:out>
<td>
<a href="delete?id=${ob.id}">DELETE</a>
<a  href="edit?eid=${ob.id }">EDIT</a>
</tr>
</c:forEach>
</table>
</body>
</html>