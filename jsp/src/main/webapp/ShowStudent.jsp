<%@ page import="java.util.List" %>
<%@ page import="com.example.jsp.Student" %><%--
  Created by IntelliJ IDEA.
  User: wuhu
  Date: 2021/10/14
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Student> studentList = (List<Student>) request.getAttribute("stuList");
%>
</body>
</html>
