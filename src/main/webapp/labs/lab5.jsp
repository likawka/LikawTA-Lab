<%--
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

<h2 align="center">Шукане слово</h2>
<h3 align="center"><%=request.getAttribute("searchWord")%></h3>


<hr noshade size="3" width="60%">

<h2 align="center">Відсортувати список об'єктів</h2>
<h3 align="center">Невідсортований список об'єктів</h3>
<h3 align="center"><%=request.getAttribute("list")%></h3>

<hr noshade size="3" width="60%">
<h3 align="center">Відсортовані поля типу String</h3>
<h3 align="center"><%=request.getAttribute("sortStr")%></h3>

<hr noshade size="3" width="60%">
<h3 align="center">Відсортовані поля типу Short</h3>
<h3 align="center"><%=request.getAttribute("sortShr")%></h3>

<hr noshade size="3" width="60%">
<h3 align="center">Відсортований список об'єктів</h3>
<h3 align="center"><%=request.getAttribute("sortedList")%></h3>

<hr noshade size="3" width="60%">
<h2 align="center">Багатопотоковий пошук</h2>
<h3 align="center"><%=request.getAttribute("mts")%></h3>

<hr noshade size="3" width="100%">
<div>

    <form action="lab5form.jsp" align="center">

        <input type="submit" value="New values">

    </form>

</div>


<div>

    <form action="index.jsp" align="center">

        <input type="submit" value="Home">

    </form>

</div>



<hr noshade size="2" width="100%">
<form action="../index.jsp" align="center">
    <input type="submit" value="Home">
</form>

</body>
</html>
