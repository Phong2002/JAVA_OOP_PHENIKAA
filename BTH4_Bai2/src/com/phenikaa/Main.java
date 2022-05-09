package com.phenikaa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public void SortStudent(List<Student> studentList){

    }

    public static void main(String[] args) {



    Subject Toan1 = new Subject(101,"Toan",7d,9d);
    Subject Toan2 = new Subject(201,"Toan",6d,9d);
    Subject Toan3 = new Subject(301,"Toan",7d,8d);
    Subject Toan4 = new Subject(401,"Toan",5d,9d);
    Subject Toan5 = new Subject(501,"Toan",7d,7d);
    Subject Toan6 = new Subject(601,"Toan",8d,10d);
    Subject Toan7 = new Subject(701,"Toan",10d,9d);

    Subject Tin1 = new Subject(102,"Tin",8d,9d);
    Subject Tin2 = new Subject(202,"Tin",10d,9d);
    Subject Tin3 = new Subject(302,"Tin",8d,9d);
    Subject Tin4 = new Subject(402,"Tin",9d,9d);
    Subject Tin5 = new Subject(502,"Tin",9d,10d);
    Subject Tin6 = new Subject(602,"Tin",8.5d,8.5d);
    Subject Tin7 = new Subject(702,"Tin",7.8d,8.5d);

    Subject[] subs1 = {Toan1,Tin1};
    Subject[] subs2 = {Toan2,Tin2};
    Subject[] subs3 = {Toan3,Tin3};
    Subject[] subs4 = {Toan4,Tin4};
    Subject[] subs5 = {Toan5,Tin5};
    Subject[] subs6 = {Toan6,Tin6};
    Subject[] subs7 = {Toan7,Tin7};


	Student student1 = new Student(101,"Nguyen Van Anh",2,subs1);
	Student student2 = new Student(101,"Nguyen Van Anh",2,subs2);
	Student student3 = new Student(101,"Nguyen Van Anh",2,subs3);
	Student student4 = new Student(101,"Nguyen Van Anh",2,subs4);
	Student student5 = new Student(101,"Nguyen Van Anh",2,subs5);
	Student student6 = new Student(101,"Nguyen Van Anh",2,subs6);
	Student student7 = new Student(101,"Nguyen Van Anh",2,subs7);

    List<Student> studentList = new ArrayList<Student>();
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);
    studentList.add(student4);
    studentList.add(student5);
    studentList.add(student6);
    studentList.add(student7);

// read student list to file student.data
        try (
            FileOutputStream student = new FileOutputStream("./student.data");
            ObjectOutputStream dataStudent = new ObjectOutputStream(student);
            )
        {
           for(Student st:studentList){
                dataStudent.writeObject(dataStudent);
           }
           dataStudent.flush();
        }

        catch (Exception e)
        {
            System.out.println("IOException : " + e);
        }


// read data and sort from student.data , write to file sortstudent.data
        try (
                ObjectInputStream dataStudent = new ObjectInputStream(new FileInputStream(new File("./student.data")));
                FileOutputStream sortstudent = new FileOutputStream("./sortstudent.data");
                ObjectOutputStream dataSortStudent = new ObjectOutputStream(sortstudent) ;
        )

        {
            Student studentx=  (Student) dataStudent.readObject();
            System.out.println( studentx.toString());
            dataStudent.close();
            dataSortStudent.flush();
        }

        catch (Exception e)
        {
            System.out.println("IOException : " + e);
        }

    }
}
