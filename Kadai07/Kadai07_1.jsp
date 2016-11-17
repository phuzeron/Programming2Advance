<%-- 
    Document   : Kadai07_1
    Created on : 2016/11/17, 15:01:10
    Author     : phuzeron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Kadai07_1.jsp</h1>
        <%
            for(int i = 70; i <= 150; i++){
                if(i%8 == 0 && i%3 != 0){
                    out.println(i + "<br>");
                }
            }
        %>
    </body>
</html>
