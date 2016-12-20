<%-- 
    Document   : Ex12_1
    Created on : 2016/12/20, 11:01:23
    Author     : phuzeron
--%>

<%@page import="lecture12.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ex12_1.jsp</title>
    </head>
    <body>
        <h1>Ex12_1.jsp</h1>
        <table border="1">
            <%
                ArrayList<Student> slist = (ArrayList<Student>) request.getAttribute("slist");
                for(Student s : slist){
            %>
            <tr>
                <td><%= s.getSID()%></td>
                <td><%= s.getName()%></td>
                <td><%= s.getGakubu()%></td>
                <td><%= s.getGrade()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
