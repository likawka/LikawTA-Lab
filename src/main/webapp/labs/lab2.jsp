<%--
  Created by IntelliJ IDEA.
  User: irynalikaw
  Date: 4/8/21
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>lab 2</title>
</head>
<body bgcolor="#ffdab9">

<h1> This is second lab</h1>
<h3> Results: </h3>
<p> <%=request.getAttribute("result")%> </p>

<form action="lab2form.jsp">
    <input type= "submit" value="Return to input X">
</form>

<a href="../index.jsp">Home</a>

</body>
</html>