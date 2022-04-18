package com.phenikaa;

import java.util.Arrays;

public class StackStudent {
    private int maxSize;
    private Student[] stackArray;
    private int top;
    public StackStudent(int s) {
        maxSize = s;
        stackArray = new Student[maxSize];
        top = -1;
    }

    public void push(Student data) {
        stackArray[++top] = data;
    }


    public Student pop() {
        return stackArray[top--];
    }


    public Student peek() {
        return stackArray[top];
    }


    public boolean isEmpty() {
        return (top == -1);
    }


    public boolean isFull() {
        return (top == (maxSize - 1));
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }


}
