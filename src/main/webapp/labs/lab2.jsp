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
<body bgcolor="#FFFFF0">

<h1 align="center" > This is second lab</h1>
<hr noshade size="2" width="60%">

<h3 align="center"> Results: </h3>
<p align="center"> <%=request.getAttribute("result")%> </p>

<hr noshade size="2" width="60%">
<form action="lab2form.jsp" align="center">
    <input type= "submit" value="Return to input X">
</form>

<hr noshade size="2" width="100%" align="center">
<form action="../index.jsp" align="center">
    <input type="submit" value="Home">
</form>

</body>
</html>
