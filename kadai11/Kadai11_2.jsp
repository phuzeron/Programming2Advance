<%-- 
    Document   : Kadai11_2
    Created on : 2016/12/15, 15:13:04
    Author     : phuzeron
--%>

<%@page import="kadai11.Human"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Kadai11_2</h1>
        <%
            Human human = (Human) request.getAttribute("human");
        %>

        <p><%= human.getName() + "(" + human.getAge() + ")" + human.getKind() %></p>
    </body>
</html>
