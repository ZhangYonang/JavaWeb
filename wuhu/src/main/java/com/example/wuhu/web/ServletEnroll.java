package com.example.wuhu.web;

import com.example.wuhu.pojo.User;
import com.example.wuhu.pojo.WebUtils;
import com.example.wuhu.service.UserService;
import com.example.wuhu.service.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletEnroll", value = "/ServletEnroll")
public class ServletEnroll extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    protected void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  1、获取请求的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = WebUtils.copyParamToBean(request.getParameterMap(), new User());
        if(userService.existsUsername(username)){
            // 把回显信息，保存到Request域中
            request.setAttribute("msg", "用户名已存在！！");
            request.setAttribute("username", username);
        }


}






