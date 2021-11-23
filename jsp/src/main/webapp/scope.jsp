<%--
  Created by IntelliJ IDEA.
  User: wuhu
  Date: 2021/10/12
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>scope.jsp页面</h1>
<%
    pageContext.setAttribute("key","pageContext");
    request.setAttribute("key","request");
    session.setAttribute("key","session");
    application.setAttribute("key","application");
%>
pageContext 域是否有值:<%=pageContext.getAttribute("key")%><br>
    request 域是否有值:<%=request.getAttribute("key")%><br>
    session 域是否有值:<%=request.getAttribute("key")%><br>
    application 域是否有值:<%=request.getAttribute("key")%><br>
</body>
</html>














