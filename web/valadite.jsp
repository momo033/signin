<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSet" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%--申明bean对象，将JavaBean变为脚本变量，可以通过脚本元素来访问其元素,将JavaBean实例化：ID--%>
<jsp:useBean id="user" class="Bean.loginMeaasge"></jsp:useBean>
<%--设置写入属性,将JavaBean中的name和password设置为当前页面的输入值--%>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<%--申明JavaBean对象，传入name和password对象，进行数据验证--%>
<jsp:useBean id="test" class="MessageTest.Test"></jsp:useBean>

<%
if(test.valiuser(user))
   out.print("successful");
else
    out.print("fail");
%>


</body>
</html>
