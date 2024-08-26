package com.amac.SpringSecEx.model;

public class Student {

    private Integer id;
    private String name;
    private String marks;


    public Student(Integer id, String name, String marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}
