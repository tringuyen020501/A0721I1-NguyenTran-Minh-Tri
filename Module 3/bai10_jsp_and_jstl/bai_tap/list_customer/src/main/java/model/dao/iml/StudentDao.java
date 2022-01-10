package model.dao.iml;

import model.bean.Student;
import model.dao.IStudent;

import java.util.ArrayList;

import java.util.List;


public class StudentDao implements IStudent {
    private static List<Student> studentlist= new ArrayList<>();

    static {
        studentlist.add(new Student("tri", "02/05/2001","12 đường 2/9","9"));
        studentlist.add(new Student("win", "05/02/2002","22 đường 9/2","8"));
        studentlist.add(new Student("nguyen", "05/02/2003","22 đường núi thành","7"));
    }
}
