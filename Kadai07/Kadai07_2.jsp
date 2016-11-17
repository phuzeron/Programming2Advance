<%-- 
    Document   : Kadai07_2
    Created on : 2016/11/17, 15:12:11
    Author     : phuzeron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    double volume(int r, int h){
        return Math.PI * r*r *h / 3;
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Kadai07_2.jsp</h1>
        <p>半径5、高さ8の塩水の体積は<%=volume(5, 8)%>です。</p>
        <p>半径5、高さ8の塩水の体積は<%=String.format("%.2f", volume(5, 8))%>です。</p>
    </body>
</html>
