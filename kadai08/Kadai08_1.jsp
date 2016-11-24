<%-- 
    Document   : Kadai08_1
    Created on : 2016/11/24, 15:00:14
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
        <title>Kadai08_1.jsp</title>
    </head>
    <body>
        <h1>Kadai08_1.jsp</h1>
        <table border="1">
            <tr>
                <td>氏名</td>
                <td><%= request.getParameter("text1")%></td>
            </tr>
            <tr>
                <td>学部</td>
                <td><%= request.getParameter("radio1")%></td>
            </tr>
            <tr>
                <td>興味</td>
                <td>
                    <%
                        for(int i = 1; i <= 6; i++){
                            String getStr = request.getParameter("check" + i);
                            if(getStr != null){
                                out.println(getStr + "<br>");
                            }
                        }
                    %>
                </td>
            </tr>
        </table>
    </body>
</html>
