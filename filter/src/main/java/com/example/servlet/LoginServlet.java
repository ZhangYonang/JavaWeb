package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("wuhu".equals(username) && "qifei".equals(password)){
            request.getSession().setAttribute("user",username);
            response.getWriter().write("登录成功");
        }else {
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
}
















