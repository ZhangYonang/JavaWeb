<%@ page import="com.example.el.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: wuhu
  Date: 2021/10/15
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person = new Person();
    person.setName("含金轮");
    person.setPhones(new String[]{"19992929292","188888888888","18999898765"});
    List<String> city = new ArrayList<String>();
    city.add("芜湖");
    city.add("芜湖");
    city.add("芜湖");
    person.setCity(city);
    Map<String,Object>map = new HashMap<>();
    map.put("key1","value1");
    map.put("key","value2");
    map.put("key3","value3");
    person.setMap(map);
    pageContext.setAttribute("person",person);
%>
输出Person：${person}<br>
输出Person的name属性: ${p.name}<br>
输出Person的phone数组属性值:${p.phones[0]}<br>
输出Person的cities集合中的元素值:${p.city}<br>
输出Person的List集合在个别元素值:${p.cities[2]}<br>
输出Person的Map集合:${p.map}<br>
输出Person的Map集合中某个key的值${p.map.key1}<br>

</body>
</html>

















