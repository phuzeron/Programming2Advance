<%-- 
    Document   : Ex11_1
    Created on : 2016/12/13, 11:27:54
    Author     : phuzeron
--%>

<%@page import="lecture11.Exam"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ex11_1.jsp</title>
    </head>
    <body>
        <h1>Ex11_1.jsp</h1>
        <%
            Exam ex = (Exam) request.getAttribute("ex");
        %>

        <p><%= ex.getName()%>, 点数=<%= ex.getPoint()%>, 評価=<%= ex.getResult()%></p>
    </body>
</html>
