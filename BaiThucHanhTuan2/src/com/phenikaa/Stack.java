package com.phenikaa;

public class Stack implements IStack<Long>{
    private int maxSize;
    private long[] stackArray;
    private int top;
    public Stack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    @Override
    public void push(Long data) {
        stackArray[++top] = data;
    }

    @Override
    public Long pop() {
        return stackArray[top--];
    }

    @Override
    public Long peek() {
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
