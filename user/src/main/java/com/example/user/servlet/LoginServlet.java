package com.example.user.servlet;

import com.example.user.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(userService.getUser(username,password)==null){
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else {
            request.getSession().setAttribute("username","username");
            request.getSession().setAttribute("password","password");
        }
    }
}





















