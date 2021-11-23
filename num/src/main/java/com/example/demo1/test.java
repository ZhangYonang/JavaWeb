package com.example.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "test", value = "/test")
public class test extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        ServletContext sc = request.getServletContext();
        Object num = sc.getAttribute("access");
        if (num != null && num instanceof Integer) {
            num = ((Integer) num) + 1;
            response.getWriter().print("网站共被访问" + num + "次");
            sc.setAttribute("access", num);
        } else {
            sc.setAttribute("access", 1);
            response.getWriter().print("网页被访问一次");
        }
    }
}