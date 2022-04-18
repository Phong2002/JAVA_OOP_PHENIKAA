package com.phenikaa;

public class Node {
    private Integer data;
    private Node next;

    public Node() {
    }

    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Integer data){
        this.data=data;
        this.next=null;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
