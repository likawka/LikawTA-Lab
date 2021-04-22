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
    TextProcessing processor = new TextProcessing("The Internet of Things, or IoT, refers to the billions of physical devices around the world that are now connected to the internet, all collecting and sharing data. Thanks to the arrival of super-cheap computer chips and the ubiquity of wireless networks, it's possible to turn anything, from something as small as a pill to something as big as an aeroplane, into a part of the IoT. Connecting up all these different objects and adding sensors to them adds a level of digital intelligence to devices that would be otherwise dumb, enabling them to communicate real-time data without involving a human being. The Internet of Things is making the fabric of the world around us more smarter and more responsive, merging the digital and physical universes. How big is the Internet of Things? Big and getting bigger -- there are already more connected things than people in the world.\n" +
            "Tech analyst company IDC predicts that in total there will be 41.6 billion connected IoT devices by 2025, or \"things.\" It also suggests industrial and automotive equipment represent the largest opportunity of connected \"things,\", but it also sees strong adoption of smart home and wearable devices in the near term.  \n" +
            "Another tech analyst, Gartner, predicts that the enterprise and automotive sectors will account for 5.8 billion devices this year, up almost a quarter on 2019. Utilities will be the highest user of IoT, thanks to the continuing rollout of smart meters. Security devices, in the form of intruder detection and web cameras will be the second biggest use of IoT devices. Building automation – like connected lighting – will be the fastest growing sector, followed by automotive (connected cars) and healthcare (monitoring of chronic conditions). The benefits of the IoT for business depend on the particular implementation; agility and efficiency are usually top considerations.");
%>

<h1 align="center"> Text editor </h1>
<hr noshade size="3" width="100%">

<h3 align="center">Original text: </h3>
<p align="center"> <%= processor.getText() %></p>
<hr noshade size="2" width="100%">

<h3 align="center">Clean text: </h3>
<p align="center"><%= processor.getCleanText() %></p>
<hr noshade size="2" width="100%">

<p align="center">Total Words: <%= processor.getTotalWordCount() %></p>
<hr noshade size="2" width="60%">

<p align="center">Unique words: <%= processor.getUniqueWordsCount() %></p>
<hr noshade size="2" width="60%">

<p align="center">Most Frequent words: <%= processor.getMostFrequentWords() %></p>
<hr noshade size="2" width="60%">

<p align="center">Words without "h": <%= processor.getWordsWithoutH() %> </p>
<hr noshade size="2" width="60%">

<p align="center">Words with exactly 2 unique letters: <%= processor.getTwoDifferentLetterWords() %></p>
<hr noshade size="2" width="60%">

<p align="center">Most common 3-letter sequences: <%= processor.getThreeLetterSeqs() %></p>
<hr noshade size="2" width="100%">

<form action="../index.jsp" align="center">
    <input type="submit" value="Home">
</form>

</body>
</html>
