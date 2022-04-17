package com.phenikaa;

import java.util.Scanner;

public class Main {

    public static void BubbleSort(int [] arr){
        for (int i=0;i< arr.length-1;++i){
            for(int j=0;j< arr.length-i-1; ++j){
                if(arr[j+1]<arr[j]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;

                }
            }
        }
    }

    public  static double Avg(int[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    public static void PrintArr(int[]arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Bai 1 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Ham truoc khi sap xep : ");
        PrintArr(arr);
        BubbleSort(arr);
        System.out.println("Ham sau khi sap xep : ");
        PrintArr(arr);


        System.out.println("Bai 2 : ");
        Point point1 = new Point(1,2);
        Point point2 = new Point(3,-1);
        Point point3 = new Point(6,-4);

        System.out.println((Point.Acreage(point1,point2,point3))!=0?"Dien tich tam giac la "+Point.Acreage(point1,point2,point3):"Khong tinh duoc dien tich");

        System.out.println("Bai 3 : ");

        Point3D a = new Point3D(-1,2,1);
        Point3D b = new Point3D(3,1,4);
        Point3D c = new Point3D(4,1,5);

        Vector vector = Point3D.PlaneEquation(a,b,c);


        System.out.println("Nhap diem X : ");
        double x = sc.nextDouble();
        System.out.println("Nhap diem Y : ");
        double y = sc.nextDouble();
        System.out.println("Nhap diem Z : ");
        double z = sc.nextDouble();

        Point3D point = new Point3D(x,y,z);

        System.out.println((Point3D.DiemTrongMatPhang(vector,point))?"Diem nam trong mat phang":"Diem khong nam trong mat phang");
    }
}
