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

        StackStudent stackStudent = new StackStudent(8);

        Student student1 = new Student(101,"Nguyen Van A",7.8d);
        Student student2 = new Student(102,"Nguyen Van B",9.0d);
        Student student3 = new Student(103,"Nguyen Van C",8.4d);
        Student student4 = new Student(104,"Nguyen Van D",2.5d);
        Student student5 = new Student(105,"Nguyen Van E",4.8d);
        Student student6 = new Student(106,"Nguyen Van F",9.9d);

        stackStudent.push(student1);
        stackStudent.push(student2);
        stackStudent.push(student3);
        stackStudent.push(student4);
        stackStudent.push(student5);
        stackStudent.push(student6);

        System.out.println("\n");
        System.out.print(stackStudent.isFull()?"Ngan xep da day ! ":"Ngan xep chua day !");
        System.out.print("\nPeek :\n "+ stackStudent.peek().toString());
        System.out.print("\nPop  :\n"+stackStudent.pop().toString());
        System.out.print("\nPeek :\n"+stackStudent.peek().toString());

    }
}
