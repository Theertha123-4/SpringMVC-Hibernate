<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <div align="center">
         <table border="1" cellpadding="5">
             <center><marquee scrollamount="5" width="40"
font-color="red";>&lt;&lt;&lt; </marquee>Below are a list of donors
:<marquee scrollamount="5" direction="right"
width="40">&gt;&gt;&gt;</marquee></center>
             <tr>
                 <th>Id</th>
                 <th>Name</th>
                 <th>Mark</th>

             </tr>
          <c:forEach items="${list}"  var="i">
                 <tr>
                      <td><c:out value="${i.id}"/></td>
                     <td><c:out value="${i.name}"/></td>
                     <td><c:out value="${i.salary}"/></td>
                    
                     <td><a href="delete?id=${i.id}">delete</a> </td>
                   <td><a href="edit?id=${i.id}">edit</a> </td>
                 </tr>
             </c:forEach>
         </table>
     </div>
</body>
</html>



