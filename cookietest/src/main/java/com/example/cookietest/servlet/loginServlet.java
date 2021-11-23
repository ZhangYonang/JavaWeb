package com.example.cookietest.servlet;

import com.example.cookietest.util.CookieUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 获取谷歌的验证码Session 验证验证码
        String token = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        request.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
        String code = request.getParameter("code");
        if (token != null && token.equalsIgnoreCase(code)) {
            if ("root".equals(username) && "root".equals(password)) {
                // 登录成功
                Cookie UsernameCookie = new Cookie("username", username);
                Cookie PasswordCookie = new Cookie("password", password);
                UsernameCookie.setMaxAge(60 * 60 * 24 * 7);// 当前cookie一周内有效
                PasswordCookie.setMaxAge(60 * 60 * 24 * 7);
                response.addCookie(UsernameCookie);
                response.addCookie(PasswordCookie);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/wel.html");
                requestDispatcher.forward(request,response);
            } else {
                // 登录失败
                response.getWriter().write("用户名或密码错误");

            }
        } else {
            response.getWriter().write("验证码错误");
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
