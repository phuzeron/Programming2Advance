<%-- 
    Document   : Kadai07_4
    Created on : 2016/11/17, 15:24:35
    Author     : phuzeron
--%>

<%@page import="java.time.Period"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(new Date());
    }
%>

<%!
    int getAge(int year, int month, int day){
        LocalDate nowDate = LocalDate.now();
        LocalDate birthdayDate = LocalDate.of(year, month, day);
        return Period.between(birthdayDate, nowDate).getYears();
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Kadai07_4.jsp</h1>
        <p>誕生日:1990年11月20日</p>
        <p><%=getDate()%>現在で<%=getAge(1990, 11, 20)%>歳です！</p>
    </body>
</html>
