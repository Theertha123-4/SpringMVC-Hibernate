<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form action="edit" method="post">
 <c:forEach items="${list}"  var="ob">
<label> ID:</label>
<input type="text" name="id" id="id" value="${ob.id}" readonly/>
<label> Name:</label>
<input type="text" name="name" id="name" value="${ob.name}"/>
<label>Address:</label>
<input type="text" name="salary" id="salary" value="${ob.salary}"/>
<input type="submit" name="submit"  value="save"/>
</c:forEach>
</form>
</body>
</html>

