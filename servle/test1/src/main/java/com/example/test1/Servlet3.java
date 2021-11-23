package com.example.test1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet3", value = "/Servlet3")
public class Servlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求的参数
        String username = request.getParameter("username");
        System.out.println("Servlet3中查看参数"+username);
        //
        request.setAttribute("key","wuhu");
        //
        /**
         *  请求转发必须要以斜杠打头，/ 表示地址为 http://ip:port/工程名 映射到IDEA代码的web目录
         */
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/b.html");
        // 走向 Servlet4
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
