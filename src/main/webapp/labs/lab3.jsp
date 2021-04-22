<%--
  Created by IntelliJ IDEA.
  User: irynalikaw
  Date: 4/15/21
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lab 3</title>
</head>
<body bgcolor="#FFFFF0">
<h1> This is third lab </h1>
<h3> Determine the number of those that are the square of a natural number. </h3>
<h3> Results: </h3>
<p> <%=request.getAttribute("result")%> </p>

<form action="lab3form.jsp">
    <input type= "submit" value="Return to input array">
</form>



<a href="../index.jsp">Home</a>
</body>
</html>
