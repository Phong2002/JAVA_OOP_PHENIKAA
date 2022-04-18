package com.phenikaa;

public class Student{
    private int studentCode;
    private String name;
    private double GPA;

    public Student(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student(int studentCode, String name, double GPA) {
        this.studentCode = studentCode;
        this.name = name;
        this.GPA = GPA;
    }

    public Student() {
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getNamel() {
        return name;
    }

    public void setNamel(String namel) {
        this.name = namel;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student Code : "+studentCode+"\nName : "+name+"\nGPA : "+GPA;
    }
}
