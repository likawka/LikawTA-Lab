<%--
  Created by IntelliJ IDEA.
  User: irynalikaw
  Date: 4/5/21
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="knu.fit.ist.LikawTA.Lab.NumberStorage"%>


<html>
<head>
    <title>lab 1</title>
</head>
<body bgcolor="#FFFFF0">

<h1 align="center"> This is first lab</h1>
<hr noshade size="2" width="60%">


<%
    NumberStorage storage = new NumberStorage(10);
%>

<p align="center" >Create storage with number: <%= storage.getNumber() %></p>

<%
    storage.setNumber(8);
%>

<p align="center">Change number to: <%= storage.getNumber() %></p>

<p align="center">To string from the class: <%= storage.toString() %></p>

<hr noshade size="2" width="60%">
<%
    int x = storage.getNumber();

    x+=3;
    x%=3;
%>

<p align="center"> 8 mod 3 = <%=x%>  </p>

<hr noshade size="2" width="100%">

<form action="../index.jsp" align="center">
    <input type="submit" value="Home">
</form>


</body>
</html>
