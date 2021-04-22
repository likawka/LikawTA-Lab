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
<h1 align="center"> This is third lab </h1>
<h3 align="center"> Determine the number of those that are the square of a natural number. </h3>
<hr noshade size="2" width="60%">
<h3 align="center"> Results: </h3>
<p align="center"> <%=request.getAttribute("result")%> </p>
<hr noshade size="2" width="60%">
<form action="lab3form.jsp" align="center">
    <input type= "submit" value="Return to input array">
</form>


<hr noshade size="2" width="100%">
<form action="../index.jsp" align="center">
    <input type="submit" value="Home">
</form>
</body>
</html>
