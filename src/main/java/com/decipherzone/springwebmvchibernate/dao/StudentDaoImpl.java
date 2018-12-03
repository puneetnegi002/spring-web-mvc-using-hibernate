
package com.decipherzone.springwebmvchibernate.dao;

import com.decipherzone.springwebmvchibernate.Model.Student;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

/**
 * This class Process all the queries of database.
 */

@Transactional
@Repository

public class StudentDaoImpl implements StudentDao {

    private final static Logger logger = Logger.getLogger(StudentDaoImpl.class);

    private SessionFactory sessionFactory;

    @Autowired
    public StudentDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    /**
     * @return list
     * @Purpose - this method fetch all the record from database and return as a list.
     * @implnote - getAllEmployees method fetch all the records present in the student table using resultsetExtreactor and
     * return it as a list
     */
    @SuppressWarnings("unchecked")
    public List<Student> getAllStudents() {
        Session session = this.sessionFactory.openSession();
        List<Student> list = session.createQuery("from Student").list();
        for (Student student : list) {
            logger.info("Student List::" + student);
        }
        return list;
    }

    /**
     * @param id - removeSTudentdetails method receives id as parameter
     * @Purpose - removeStudentDetails method remove the details of student using studentid.
     */

    @Override
    public void removeStudentdetails(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.getTransaction();

        try {
            transaction.begin();
            Query query = session.createQuery("delete from Student s where s.id=:sid");
            query.setParameter("sid", id);
            query.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            transaction.rollback();
        } finally {
            session.close();
        }
    }

    /**
     * @param student - Updatestudentdetailsmethod student object as parameter.
     * @Purpose - This method update student details such as name and age using student id
     */

    @Override
    public void updateStudentdetails(Student student) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        try {
            transaction.begin();
            session.update(student);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error(e.getMessage(), e);
        } finally {
            session.close();
        }
    }

    /**
     * @param id - getEmpByID receives student id as parameter
     * @return student
     * @Purpose - This method fetch the record od a student using student id from database
     */

    @Override
    @SuppressWarnings("unchecked")
    public Student getEmpById(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        Student student = null;
        try {
            transaction.begin();
            student = session.get(Student.class, id);
            transaction.commit();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            transaction.rollback();
        } finally {
            session.close();
        }
        return student;
    }


    /**
     * @param student - this method receives student object as parameter.
     * @Purpose - This method insert the records of a student into the database.\
     * records are inserted by user.
     */

    public void addstudentdetails(Student student) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.getTransaction();

        try {
            transaction.begin();
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            transaction.rollback();
        } finally {
            session.close();
        }

    }

}