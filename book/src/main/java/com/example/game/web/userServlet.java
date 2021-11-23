package com.example.game.web;

import com.example.game.pojo.User;
import com.example.game.service.impl.userServletImpl;
import com.example.game.service.userService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "userServlet", value = "/userServlet")
public class userServlet extends BaseServlet {
    private userService userService = new userServletImpl();

    /**
     * 注销
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 销毁Session中用户登录的信息
        request.getSession().invalidate();
        // 重定向到首页
        response.sendRedirect(request.getContextPath());
    }

    /**
     * 登录
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 调用userService.login()处理登录业务
        User loginUser = userService.login(new User(null,username,password));
        // 如果等于null，表示登录失败
        if(loginUser == null){
            // 把错误信息，和回显表单信息保存到Request域中
            request.setAttribute("msg","用户名或密码错误");
            request.setAttribute("username",username);
            // 跳回登录页面
            request.getRequestDispatcher("index.jsp").forward(request,response);
        } else {
            // 登录成功
            // 保存用户登录信息到Session域中
            request.getSession().setAttribute("user",loginUser);
            // 跳转到成功页面
            request.getRequestDispatcher("home.jsp").forward(request,response);
        }
    }
}
