package com.example.servlet1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Response1", value = "/Response1")
public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // System.out.println("Response1");
        // 设置响应状态码302表示重定向
        // response.setStatus(302);
        // 设置响应头，说明 新的地址在哪里
        // response.setHeader("Location","Response2");
        response.sendRedirect("Response2");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
