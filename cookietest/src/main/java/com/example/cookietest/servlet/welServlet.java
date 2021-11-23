package com.example.cookietest.servlet;

import com.example.cookietest.util.CookieUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "welServlet", value = "/welServlet")
public class welServlet extends BaseServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie usernameCookie = CookieUtil.findCookie("username", request.getCookies());
        Cookie passwordCookie = CookieUtil.findCookie("password", request.getCookies());
        if(usernameCookie == null && passwordCookie == null){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(request, response);
        }else {
            String username = usernameCookie.getValue();
            String password = passwordCookie.getValue();
            if ("root".equals(username) && "root".equals(password)) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/wel.html");
                requestDispatcher.forward(request, response);
            }

        }

    }
}


