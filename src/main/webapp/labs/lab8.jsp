<%@ page import="knu.fit.ist.LikawTA.Lab8.Solution" %><%--
  Created by IntelliJ IDEA.
  User: irynalikaw
  Date: 5/25/21
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lab8</title>
</head>
<body bgcolor="#FFFFF0">

<h1 align="center"> Laboratory work 8 </h1>
<h2 align="center" > Product of all elements except arr[i]: </h2>

<hr noshade size="2" width="100%">
<h3 align="center" > Your array: <%= request.getParameter("x") %></h3>
<p align="center" > The first solution: <%= request.getAttribute("res_1") %></p>
<p align="center" > The second solution: <%= request.getAttribute("res_2") %></p>
<p align="center" > The third solution: <%= request.getAttribute("res_3") %></p>


<hr noshade size="2" width="100%">
<form action="../index.jsp" align="center">
    <input type="submit" value="Home">
</form>

<form action="lab8form.jsp" align="center">
    <input type= "submit" value="Return to input array">
</form>

</body>
</html>
