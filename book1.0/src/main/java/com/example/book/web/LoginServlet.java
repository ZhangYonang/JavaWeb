package com.example.book.web;

import com.example.book.pojo.User;
import com.example.book.service.impl.userServletImpl;
import com.example.book.service.userService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    private userService userService = new userServletImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        // 调用 userServlet.login
        User loginUser = userService.login(new User(null,username,password));
        // null 说明登录失败
        if(loginUser == null){
            // 把错误信息，和回显的表单项信息，保存到Request域中
            request.setAttribute("msg","用户名或密码错误");
            request.setAttribute("username",username);
            // 跳回登录页面
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }else {
            // 登录成功
            // 跳转到成功页面
            request.getRequestDispatcher("success.html").forward(request,response);
        }

    }
}
















