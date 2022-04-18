package com.phenikaa;

public class Main {

    public static void main(String[] args) {
	    IStack StackArray = new Stack(10);
        StackArray.push(5);
        StackArray.push(68);
        StackArray.push(2);
        StackArray.push(42);
        StackArray.push(16);
        StackArray.push(82);
        StackArray.push(42);
        StackArray.push(87);
        StackArray.push(99);
        System.out.print(StackArray.isFull()?"Ngan xep da day ! ":"Ngan xep chua day !");
        System.out.print("\nPeek : "+ StackArray.peek());
        System.out.print("\nPop  : "+StackArray.pop());
        System.out.print("\nPeek :"+StackArray.peek());

        System.out.println("\n");
        // Khoi tao stack su dung danh sach lien ket voi size la 6
        IStack StackLinkedList = new StackLinkedList(6);
        StackLinkedList.push(48);
        StackLinkedList.push(58);
        StackLinkedList.push(42);
        StackLinkedList.push(31);
        StackLinkedList.push(65);
        StackLinkedList.push(9);
        System.out.print(StackLinkedList.isFull()?"Ngan xep da day ! ":"Ngan xep chua day !");
        System.out.print("\nPeek : "+ StackLinkedList.peek());
        System.out.print("\nPop  : "+StackLinkedList.pop());
        System.out.print("\nPeek :"+StackLinkedList.peek());

        System.out.println("\n");
        long []arr={1,2,3,4,5};
        long []arrReverse = new long[arr.length];
        System.out.print("\nDanh sach cho truoc : ");
        for(long x:arr){
            System.out.print(x+" ");
        }

        Stack stack= new Stack(arr.length);
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        for(int i=0;i<stack.getMaxSize();i++){
            arrReverse[i]=stack.pop();
        }

        System.out.print("\nHam sau khi dao nguoc : ");
        for(long x:arrReverse){
            System.out.print(x+" ");
        }

    }
}
