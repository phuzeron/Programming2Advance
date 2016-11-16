<%-- 
    Document   : Ex71
    Created on : 2016/11/15, 10:53:24
    Author     : phuzeron
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(new Date());
}
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            for(int i = 0; i < 5; i++){
                out.println("くりかえし" + i + "回<br />");
            }
        %>
        
        本日は<%=getDate()%>です。
        
        <hr />
        <%@include file="./Ex72.jsp" %>
        <hr />
    </body>
</html>
