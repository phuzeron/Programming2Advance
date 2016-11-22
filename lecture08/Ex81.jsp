<%-- 
    Document   : Ex81
    Created on : 2016/11/22, 10:51:05
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
        <title>Ex81.jsp</title>
    </head>
    <body>
        <h3>Ex81.jsp</h3>
        <table border="1">
            <tr>
                <td>year</td>
                <td><%= request.getParameter("year")%></td>
            </tr>
            <tr>
                <td>month</td>
                <td><%= request.getParameter("month")%></td>
            </tr>
            <tr>
                <td>day</td>
                <td><%= request.getParameter("day")%></td>
            </tr>
        </table>
    </body>
</html>
