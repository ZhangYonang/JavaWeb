<%--
  Created by IntelliJ IDEA.
  User: wuhu
  Date: 2021/11/5
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/css.css">
    <title>登录</title>
</head>

<body>
<div class="wrap">
    <div class="form">
        <div class="left"><video src="video/video.mp4" muted loop autoplay></video></div>
        <div class="right">
            <div class="right-con">
                <h1>用 户 注 册</h1>
                <h3>用户名</h3>
                <form action="registerServlet" method="post">
                    <input type="hidden" name="action" value="register" />
                    <input class="text" type="text" autocomplete="off" name="username"
                           value="${requestScope.username}"
                    />
                    <h3>密 码</h3>
                    <input class="text" type="password" autocomplete="off" name="password">
                    <input class="btn" type="submit" value="提 交">
                </form>
            </div>
        </div>
    </div>
</div>
</body>

</html>
