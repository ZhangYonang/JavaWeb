<%--
  Created by IntelliJ IDEA.
  User: wuhu
  Date: 2021/10/15
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%request.setAttribute("key","request");
  session.setAttribute("key","session");
  application.setAttribute("key","application");
  pageContext.setAttribute("key","pageContext");
%>
${key}
</body>
</html>
