<%-- 
    Document   : Kadai08_2
    Created on : 2016/11/24, 15:13:02
    Author     : phuzeron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kadai08_2.jsp</title>
    </head>
    <body>
        <h1>Kadai08_2.jsp</h1>
        <h2>アンケート結果</h2>
        <hr>
        <ul style="list-style:none;">
            <li>名前:<%= request.getParameter("name")%></li>
            <li>評価:<%= request.getParameter("evaluation")%></li>
            <li>自由意見:<%= request.getParameter("opinion")%></li>        
        </ul>
    </body>
</html>
