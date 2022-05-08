package com.phenikaa;
import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private int StudentCode;
    private String name;
    private int n;
    private Subject [] subjects;

    public Student() {
    }

    public Student(int studentCode, String name, int n, Subject[] subjects) {
        StudentCode = studentCode;
        this.name = name;
        this.n = n;
        this.subjects = subjects;
    }

    public int getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(int studentCode) {
        StudentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public double diemTrungBinhCacMon(){
        double sum=0;
        for(Subject x:subjects){
            sum+=x.AVG();
        }
        double avg = sum / subjects.length;
        return avg;
    }

    @Override
    public String toString() {
        return "StudentCode=" + StudentCode +'\'' +
                "name='" + name + '\'' +
                "n=" + n +'\'' +
                "avg subjects=" + diemTrungBinhCacMon();

    }
}
