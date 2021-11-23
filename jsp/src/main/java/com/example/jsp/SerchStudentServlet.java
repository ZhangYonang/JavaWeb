package com.example.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SerchStudentServlet", value = "/SerchStudentServlet")
public class SerchStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 获取请求的参数
        // 发sql语句查询学生的信息
        // for循环生成查询到的数据模拟
        List<Student> student = new ArrayList<Student>();
        for(int i = 0 ;i<10;i++){
            int t = i+1;
            student.add(new Student(t,"name"+t,18+t,"phone"+t));
        }
        // 保存查询到的结果（学生信息）到request域中
        request.setAttribute("stuList",);
        // 请求转发到showStudent.jsp页面
        request.getRequestDispatcher("/showStudents").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
