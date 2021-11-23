package com.example.test1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet4", value = "/Servlet4")
public class Servlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求的参数
        String username = request.getParameter("username");
        System.out.println("Servlet4中查看参数"+username);
        // 查看Servlet3的值key
        Object key = request.getAttribute("key");
        System.out.println("查看Servlet3中的key"+key);
        // 处理自己的业务
        System.out.println("Servlet4自己的业务");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
