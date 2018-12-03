package com.decipherzone.springwebmvchibernate.service;

import com.decipherzone.springwebmvchibernate.Model.Student;
import com.decipherzone.springwebmvchibernate.dao.StudentDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDao studentdao;

    public StudentServiceImpl(StudentDao studentdao) {
        this.studentdao = studentdao;
    }

    @Override
    public List<Student> getAllStudents() {

        List<Student> list = studentdao.getAllStudents();
        return list;
    }

    @Override
    public void removeStudentdetails(int id) {
        studentdao.removeStudentdetails(id);
    }

    @Override
    public void updateStudentdetails(Student student) {
        studentdao.updateStudentdetails(student);
    }

    @Override
    public Student getEmpById(int id) {
        return studentdao.getEmpById(id);
    }

    @Override
    public void addstudentdetails(Student student) {
        studentdao.addstudentdetails(student);
    }
}
