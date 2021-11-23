package com.example.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 获取谷歌的Session
        // String token = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        // 删除Session中的验证码
        // request.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
        // 获取验证码
        // String code = request.getParameter("code");
        // 检查验证码是否正确
        // if (token != null && token.equalsIgnoreCase(code)) {


            if ("root".equals(username) && "root".equals(password)) {
                // 登录成功
                Cookie UsernameCookie = new Cookie("username", username);
                Cookie PasswordCookie = new Cookie("password", password);
                UsernameCookie.setMaxAge(60 * 60 * 24 * 7);// 当前cookie一周内有效
                PasswordCookie.setMaxAge(60 * 60 * 24 * 7);
                response.addCookie(UsernameCookie);
                response.addCookie(PasswordCookie);
                response.getWriter().write("登录成功");
            } else {
                // 登录失败
                response.getWriter().write("用户名或密码错误");
            }
      //  } else {
        //    response.getWriter().write("验证码错误");
       // }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
