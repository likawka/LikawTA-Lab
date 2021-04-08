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
<body>

<h1> This is first lab</h1>
<p>----------------------------------------------------</p>

<%
    NumberStorage storage = new NumberStorage(10);
%>

<p>Create storage with number: <%= storage.getNumber() %></p>

<%
    storage.setNumber(8);
%>

<p>Change number to: <%= storage.getNumber() %></p>

<p>To string from the class: <%= storage.toString() %></p>

<p>----------------------------------------------------</p>
<%
    int x = storage.getNumber();

    x+=3;
    x%=3;
%>

<p> 8 mod 3 = <%=x%>  </p>
<a href="../index.jsp">Home</a>


</body>
</html>
