package model.bo;

import model.bean.Student;

import java.util.List;

public interface IStudentBo {
    List<Student> findAll();
}
