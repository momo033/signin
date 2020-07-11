# signin
编写index.jsp，并设置为首页
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<jsp:useBean id="date" class="java.util.Date"></jsp:useBean>
<p>日期为：<%= date %>
<h1>Welcome</h1>

<form action="valadite.jsp" name="login">

    用户名：<label>
    <input type="text" name="name" >
</label><br>
    密 码：<label>
    <input type="password" name="password">
</label><br>
    <%--<button type="button">注册</button>--%>
    <input type="submit">

</form>

</body>
</html>


