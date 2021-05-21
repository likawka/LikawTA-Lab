<%@page import="knu.fit.ist.LikawTA.Lab4.Text"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lab 5</title>
</head>
<body bgcolor="#FFFFF0">
<%!Text text = new Text();%>



<div>

    <form action="../lab5" method="post" align="center">

        <%=text.cleanText(text.text)%>

        <h2>Кількість слів:  <%=text.sizeOfList(text.cleanText(text.text))%></h2>

        <hr noshade size="3" width="100%">

        <h2>Введіть шукане слово</h2>

        <input type="text" name="word" placeholder="Enter the word"/>


        <h2>Не обов'язково вводити</h2>
        <h3>Якщо ви хочете знайти слово в певній частині тексту, введіть початковий індекс,
            індекс фінішу або індекси старту та фінішу</h3>
        <input type="text" name="start" placeholder="Enter the start index"/>
        <input type="text" name="finish" placeholder="Enter the finish index"/>
        <hr noshade size="3" width="60%">


        <h1>Сортування об'єктів</h1>
        <h2>Введіть кількість об'єктів</h2>
        <input type="text" name="num" placeholder="Enter the number of objects"/>
        <hr noshade size="3" width="60%">



<%--        <h1>Багатопотоковий пошук</h1>--%>
<%--        <h2>Введіть кількість потоку</h2>--%>

<%--        <input type="text" name="threads" placeholder="Enter the number of the threads"/>--%>

<%--        <h2>Введіть шукане ціле число</h2>--%>

<%--        <input type="text" name="intp" placeholder="Enter the int value"/>--%>

<%--        <h2></h2>--%>

       <input type="submit" value="Ok"/>


    </form>

</div>


</body>
</html>