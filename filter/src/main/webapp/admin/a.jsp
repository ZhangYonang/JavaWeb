<%--
  Created by IntelliJ IDEA.
  User: wuhu
  Date: 2021/10/26
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  Object user = session.getAttribute("user");
  // 如果等于null，说明还没有登录
    if(user == null){
        request.getRequestDispatcher("login.jsp").forward(request,response);
        return;
    }
%>

</body>
</html>
