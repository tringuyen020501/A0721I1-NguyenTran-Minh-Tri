package controller;

import model.bean.Student;
import model.bo.IStudentBo;
import model.bo.stubo.StudentBo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet",urlPatterns ={"/student"} )
public class StudentServlet extends HttpServlet {
    private IStudentBo iStudentBo = new StudentBo();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList = iStudentBo.findAll();
        request.setAttribute("studentList",studentList);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
