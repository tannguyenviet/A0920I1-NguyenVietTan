package controller;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;
@WebServlet(name = "StudentListServlet",urlPatterns = "/view")
public class StudentListServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        StudentService studentService = new StudentServiceImpl();
        List<Student> studentList = studentService.getAllStudent();
        request.setAttribute("studentList",studentList);
        request.getRequestDispatcher("view.jsp").forward(request,response);
    }
}
