package com.example.test1;

import sun.plugin.javascript.navig.Array;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "Servlet2", value = "/Servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");
        System.out.println("用户名"+username);
        System.out.println("密码"+password);
        System.out.println("兴趣爱好"+ Arrays.asList(hobby));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置请求的字符集为UTF-8 从而解决post请求中文乱码的问题
        request.setCharacterEncoding("UTF-8");
    }
}
