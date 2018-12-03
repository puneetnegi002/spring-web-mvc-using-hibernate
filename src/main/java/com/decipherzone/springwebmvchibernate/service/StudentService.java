package com.decipherzone.springwebmvchibernate.service;

import com.decipherzone.springwebmvchibernate.Model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    void removeStudentdetails(int id);

    void updateStudentdetails(Student student);

    Student getEmpById(int id);

    void addstudentdetails(Student student);
}
