<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: wuhu
  Date: 2021/10/9
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--声明类属性--%>
<%!
    private Integer id;
    private String name;
    private static Map<String,Object> map;
    %>
<%--声明静态代码块--%>
<%!
   static {
       map = new HashMap<String, Object>();
       map.put("key1", "value1");
       map.put("key2", "value2");
   }
%>
<%--声明类方法--%>
<%!
   public int abc(){
       return 12;
   }
%>
<%--声明内部类--%>
<%!
    public static class A {
        private Integer id = 12;
        private String abc = "abc";
    }
%>

</body>
</html>
