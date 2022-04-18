package com.phenikaa;

public class Stack implements IStack<Integer>{
    private int maxSize;
    private Integer[] stackArray;
    private int top;
    public Stack(int s) {
        maxSize = s;
        stackArray = new Integer[maxSize];
        top = -1;
    }
    @Override
    public void push(Integer data) {
        stackArray[++top] = data;
    }

    @Override
    public Integer pop() {
        return stackArray[top--];
    }

    @Override
    public Integer peek() {
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
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
