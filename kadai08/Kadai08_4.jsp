<%-- 
    Document   : Kadai08_4
    Created on : 2016/11/24, 15:53:52
    Author     : phuzeron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="kadai08.Information" %>
<%
    request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kadai08_4.jsp</title>
    </head>
    <body>
        <h1>Kadai08_4.jsp</h1>
        <p>いらっしゃいませ。<br>あなたの情報は下記のとおりです。</p>
        <hr>
        <ul style="list-style:none;">
            <%
                Information info = new Information(request.getParameter("name"), request.getParameter("gender"), request.getParameter("user"), request.getParameter("pass1"), request.getParameter("pass2"), request.getParameter("year"), request.getParameter("month"), request.getParameter("day"));
            %>
            <li>氏名=<%= info.getName()%></li>
            <li>性別=<%= info.getGender()%></li>
            <li>ユーザーネーム=<%= info.getUser()%></li>
            <li>パスワード=<%= info.getPass1()%></li>
            <li>パスワード再確認=<%= info.getPass2()%></li>
            <li>年=<%= info.getYear()%></li>
            <li>月=<%= info.getMonth()%></li>
            <li>日=<%= info.getDay()%></li>
        </ul>
    </body>
</html>
