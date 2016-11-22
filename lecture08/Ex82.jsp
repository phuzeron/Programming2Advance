<%-- 
    Document   : Ex82
    Created on : 2016/11/22, 11:16:15
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
        <title>いろいろな入力フォームの受け取り</title>
    </head>
    <body>
        <h3>Ex82.jsp</h3>
        <ul>
            <li>1行テキスト:<%= request.getParameter("text1")%></li>
            <li>パスワード:<%= request.getParameter("pass1")%></li>
            <li>テキストエリア:<%= request.getParameter("textarea1")%></li>
            <li>ラジオボタン:<%= request.getParameter("radio1")%></li>
            <li>チェックボックス1:<%= request.getParameter("check1")%></li>
            <li>チェックボックス2:<%= request.getParameter("check2")%></li>
            <li>チェックボックス3:<%= request.getParameter("check3")%></li>
            <li>選択ボックス:<%= request.getParameter("lang1")%></li>
        </ul>
        <hr>
        <%
            String str = request.getParameter("text1");
            if(str.equals("こんにちは")){
                out.println("こんにちは!");
            }else{
                out.println("わかりません!");
            }
        %>
        <hr>
        <%
            for(int i = 1; i <= 3; i++){
                String getStr = request.getParameter("check" + i);
                if(getStr != null){
                    out.println(getStr + "<br>");
                }
            }
        %>
    </body>
</html>
