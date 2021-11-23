package com.example.test1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Redirect", value = "/Redirect")
public class Redirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("芜湖起飞");
        // 设置响应状态码302 ，表示重定向 （已搬迁）
        response.setStatus(302);
        // 设置响应头，说明 新的地址在哪里
        response.setHeader("Location","Redirect2");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
