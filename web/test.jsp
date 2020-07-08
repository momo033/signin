<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>get 和 set 属性实例</title>
</head>
<body>
<jsp:useBean id="login" class="Bean.loginMeaasge"></jsp:useBean>
<jsp:setProperty name="login" property="*"></jsp:setProperty>
<jsp:useBean id="MessageTest" class="MessageTest.Test"></jsp:useBean>
<%
    MessageTest.MessageTest(login);
%>
</body>
</html>