<%--
  Created by IntelliJ IDEA.
  User: wuhu
  Date: 2021/9/25
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="loginServlet" method="get">
    用户名:<input type="text" name="username" value="${cookie.username.value}"><br>
    密 码:<input type="password" name="password" id=""><br>
    验证码:<input type="text" name="code">
    <img src="Kaptcha.jpg" alt="" style="width:100px; height: 28px;"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
