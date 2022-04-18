package com.phenikaa;

public class Node {
    private Long data;
    private Node next;

    public Node() {
    }

    public Node(Long data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Long data){
        this.data=data;
        this.next=null;
    }

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
