<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="knu.fit.ist.LikawTA.Lab6.Recursion" %>
<%@ page import="java.util.Collections" %>
<%@ page import="knu.fit.ist.LikawTA.Lab7.Tree" %><%--
  Created by IntelliJ IDEA.
  User: irynalikaw
  Date: 5/13/21
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lab6-7</title>
</head>
<body bgcolor="#FFFFF0">

<h1 align="center"> Laboratory work 6-7</h1>

<hr noshade size="2" width="100%">


<h3 align="center"> Laboratory work 6: Recursion </h3>
<p align="center" >Random array: <%= request.getAttribute("res_arr") %></p>
<p align="center"> Tail: <%= request.getAttribute("res_tail") %></p>
<p align="center"> Recursion (not tail): <%= request.getAttribute("res_recursion") %></p>
<p align="center"> Iterative: <%= request.getAttribute("res_iter") %></p>
<hr noshade size="2" width="100%">

<h3 align="center"> Laboratory work 7: Tree</h3>

<%
    List<Integer> arr = Arrays.asList(11, 6, 1, 7, 10, 9, 8, 4);
    Collections.sort(arr);

    Tree tree = new Tree(arr);
%>
<h2 align="center"> Tree Array: (11, 6, 1, 7, 10, 9, 8, 4) </h2>
<p align="center"> Recursion Tree: <%= tree.getPostOrder() %></p>
<p align="center"> Iterative Tree: <%= tree.getPostOrderIterative() %></p>



<hr noshade size="2" width="100%">
<form action="../index.jsp" align="center">
    <input type="submit" value="Home">
</form>

</body>
</html>
