package com.phenikaa;

import java.io.Serializable;

public class Subject implements Serializable {
    private static final long serialVersionUID = 1L;

    private int SubjectCode;
    private String SubjectName;
    private double x;
    private double y;

    public Subject() {
    }

    public Subject(int subjectCode, String subjectName, double x, double y) {
        SubjectCode = subjectCode;
        SubjectName = subjectName;
        this.x = x;
        this.y = y;
    }

    public int getSubjectCode() {
        return SubjectCode;
    }

    public void setSubjectCode(int subjectCode) {
        SubjectCode = subjectCode;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return
                "SubjectCode=" + SubjectCode +'\'' +
                "SubjectName='" + SubjectName +'\'' +
                "x=" + x +'\'' +
                "y=" + y +'\'' ;
    }

    public double AVG(){
        return x*0.5+y*0.5;
    }
}
