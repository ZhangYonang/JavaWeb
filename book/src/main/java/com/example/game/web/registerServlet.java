package com.example.game.web;

import com.example.game.pojo.User;
import com.example.game.service.impl.userServletImpl;
import com.example.game.service.userService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "registerServlet", value = "/registerServlet")
public class registerServlet extends BaseServlet {
    protected void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userService userService = new userServletImpl();
        // 判断用户名是否可用
        if(username == null){
            request.setAttribute("username","请输入注册的用户名");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        } else if(password == null){
            request.setAttribute("username","请输入注册的密码");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        } else if(!userService.existsUsername(username)){
            userService.registerUser(new User(username,password));
            request.getRequestDispatcher("index.jsp").forward(request,response);
        } else {
            request.setAttribute("username","用户名已存在");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }
    }
}
