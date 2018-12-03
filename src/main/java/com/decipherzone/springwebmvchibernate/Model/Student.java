package com.decipherzone.springwebmvchibernate.Model;


import javax.persistence.*;

/**
 * Purpose: Stusent class for getter and setter methods
 */
@Entity
@Table(name = "Student")
public class Student {


    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "age")
    private int age;


    /**
     * Getname method to get name
     *
     * @return Student name
     */

    public String getName() {
        return name;
    }

    /**
     * setname method to Set Student Name
     *
     * @param name - Student name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * getid method to get id
     *
     * @return Student Id
     */

    public int getId() {
        return id;
    }

    /**
     * setId method to set student id
     *
     * @param id - Student Id
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * getAge method to get student Age
     *
     * @return Student Age
     */

    public int getAge() {
        return age;
    }

    /**
     * setAge method to set student Age
     *
     * @param age - Student Age
     */

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return id + " " + name + "    " + age;
    }
}