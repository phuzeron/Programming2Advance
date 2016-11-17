<%-- 
    Document   : Kadai07_4
    Created on : 2016/11/17, 15:24:35
    Author     : phuzeron
--%>

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
//        Calendar now = Calendar.getInstance();
//        Calendar birthday = Calendar.getInstance();
//        birthday.set(year, month, day);
//        long ageMillis = now.getTimeInMillis() - birthday.getTimeInMillis();
//        Date date = new Date(ageMillis);
//        return Integer.parseInt(new SimpleDateFormat("y").format(date));
        
        Date nowDate = new Date();
        Date birthdayDate = new Date(year-1900, month-1, day);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return (Integer.parseInt(sdf.format(nowDate)) - Integer.parseInt(sdf.format(birthdayDate))) / 10000;
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
