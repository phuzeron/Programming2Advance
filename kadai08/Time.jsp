<%-- 
    Document   : Time
    Created on : 2016/11/24, 15:23:03
    Author     : phuzeron
--%>

<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Time</title>
    </head>
    <body>
        <%
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E) HH:mm:ss");
            out.println(now.format(formatter));
        %>
    </body>
</html>
