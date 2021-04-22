<%@ page import="knu.fit.ist.LikawTA.Lab4.TextProcessing" %><%--
  Created by IntelliJ IDEA.
  User: irynalikaw
  Date: 4/22/21
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lab4</title>
</head>
<body bgcolor="#FFFFF0">

<%
    TextProcessing processor = new TextProcessing("a a a a a a b b b b b c c c c d d d e e k l m n");
%>

<p>Unique words: <%= processor.getUniqueWordsCount() %></p>
<p>Most Frequent words: <%= processor.getMostFrequentWords() %></p>


</body>
</html>
