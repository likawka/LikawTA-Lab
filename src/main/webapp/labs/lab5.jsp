<%@ page import="knu.fit.ist.LikawTA.Lab4.TextProcessing" %><%--
  Created by IntelliJ IDEA.
  User: irynalikaw
  Date: 5/5/21
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lab5</title>
</head>
<body bgcolor="#FFFFF0">

<h1 align="center"> Laboratory work 5</h1>

<hr noshade size="2" width="100%">

<p align="center"> under development, sorry:(</p>

<h2 align="center">Шукане слово</h2>
<h3 align="center"><%=request.getAttribute("searchWord")%></h3>



<h2 align="center">Відсортувати список об'єктів</h2>

<h3 align="center">Невідсортований список об'єктів</h3>
<h3 align="center"><%=request.getAttribute("list")%></h3>


<h3 align="center">Відсортовані поля типу String</h3>
<h3 align="center"><%=request.getAttribute("sortStr")%></h3>


<h3 align="center">Відсортовані поля типу Short</h3>
<h3 align="center"><%=request.getAttribute("sortShr")%></h3>


<h3 align="center">Відсортований список об'єктів</h3>
<h3 align="center"><%=request.getAttribute("sortedList")%></h3>




<hr noshade size="2" width="100%">
<form action="../index.jsp" align="center">
    <input type="submit" value="Home">
</form>

</body>
</html>
