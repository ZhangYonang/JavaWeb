package com.example.user.servlet;

import com.example.user.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    private UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Object username = request.getSession().getAttribute("username");
            Object password = request.getSession().getAttribute("password");
            if(username ==null || password==null){
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }else {
                request.setAttribute("userList",userService.getAll());
                request.getRequestDispatcher("users.jsp").forward(request,response);
            }
    }
}
