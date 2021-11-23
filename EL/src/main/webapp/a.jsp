<%--
  Created by IntelliJ IDEA.
  User: wuhu
  Date: 2021/10/15
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%request.setAttribute("key","值");%>
表达式脚本输出的值:<%=request.getAttribute("key")%>
<br>
EL表达式输出key的值是:${key}
</body>
</html>
