<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
</head>
<body>
<form action="loginServlet" method="get">
    用户名:<input type="text" name="username" value="${cookie.username.value}"><br>
    密 码:<input type="password" name="password" id=""><br>
    <input type="submit" value="登录">
</form>
</body>
</html>