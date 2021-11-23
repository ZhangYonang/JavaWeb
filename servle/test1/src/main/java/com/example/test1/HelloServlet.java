package com.example.test1;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
// 1.执行servlet构造器方法
// 2.执行init初始化方法
// 3.执行service方法
// 4.执行destroy销毁方法
@WebServlet(name = "HelloServlet", value = "/HelloServlet")
public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("构造器方法");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init初始化方法");
        // 获取程序的别名
        System.out.println("servlet名字是"+servletConfig.getServletName());
        // 获取初始化参数init-param
        System.out.println("初始化username的值是"+servletConfig.getInitParameter("username"));
        System.out.println("初始化url的值是"+servletConfig.getInitParameter("url"));
        // 获取ServletContext对象
        System.out.println(servletConfig.getServletContext());
    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    /**
     * service方法是专门用来处理请求和响应的
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       // System.out.println("Hello service代码块被访问了");
        // 类型转换（因为它有getMethod()方法）
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        // 获取请求的方式
        String method = httpServletRequest.getMethod();
        if("GET".equals(method)){
            doGet();
        } else if("POST".equals(method)){
            doPost();
        }
    }

    /**
     * get请求的操作
     */
    public void doGet(){
        System.out.println("get请求");
    }

    /**
     * post请求的操作
     */
    public void doPost(){
        System.out.println("post请求");
    }
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy销毁方法");
    }
}
