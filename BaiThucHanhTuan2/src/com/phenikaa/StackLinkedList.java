package com.phenikaa;

public class StackLinkedList implements IStack<Long>{
    private Node top;
    private int size;
    public StackLinkedList(int size) {
        this.size=size;
        this.top=null;
    }

    @Override
    public void push(Long j) {
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        size--;
        Node node = new Node(j);
        node.setData(j);
        node.setNext(top);
        top=node;

    }

    @Override
    public Long pop() {
        long data=0;
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1L;
        }
        else{
            size++;
            data=top.getData();
            top=(top).getNext();
            return data;
        }
    }

    @Override
    public Long peek() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1L;
        }
        else{
            return top.getData();
        }

    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public boolean isFull() {
        return size==0;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
