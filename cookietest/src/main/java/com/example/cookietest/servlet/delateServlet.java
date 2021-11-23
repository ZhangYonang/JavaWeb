package com.example.cookietest.servlet;

import com.example.cookietest.util.CookieUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "delateServlet", value = "/delateServlet")
public class delateServlet extends HttpServlet {
    protected void deltaCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie deltaUsername = CookieUtil.findCookie("username",request.getCookies());
        Cookie deltaPassword = CookieUtil.findCookie("password",request.getCookies());
        if( deltaUsername != null && deltaPassword != null ){
            deltaUsername.setMaxAge(0);
            deltaPassword.setMaxAge(0);
            response.addCookie(deltaUsername);
            response.addCookie(deltaPassword);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(request,response);
        } else {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        deltaCookie(req, resp);
    }
}
