<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
</head>
<body>
<h3>REGISTER PAGE</h3>
<form:form action="create" method="post" modelAttribute="employee">
<pre>
ID:<form:input path="id" readonly="true"/>

NAME     <form:input path="ename"/>
ADDRESS  <form:input path="eaddr"/>

<c:choose>
<c:when test="${'EDIT' eq Mode } ">
<input type="submit" value=UPDATE>
</c:when>
<c:otherwise>
<input type="submit" value=CREATE>
</c:otherwise>
</c:choose>

</pre>
</form:form>
${ message}
</body>
</html>