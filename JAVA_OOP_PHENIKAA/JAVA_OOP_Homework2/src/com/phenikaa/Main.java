package com.phenikaa;

import java.io.*;
import java.util.Scanner;

public class Main<in> {

    public static int  fibonacci(int n) {
       return (int) ((Math.pow((1.0 + Math.sqrt(5.0)), n) - Math.pow((1.0 - Math.sqrt(5.0)), n)) / (Math.pow(2.0, n) * Math.sqrt(5.0)));
    }

    public static int sum_fibonacci(int n){
        int sum_fib=0;
        if (n < 0)
            return sum_fib;
        else{
            for(int i=0;i<=n;i++){
                sum_fib+=fibonacci(i);
            }
            }
        return sum_fib;
    }

    public static void main(String[] args) {
        int m = 0,n=0;
        int matrixA[][] = new int[0][];
        int matrixB[][] = new int[0][];
        try {
            Scanner input = new Scanner(new File("./input.txt"));
            m=input.nextInt();
            n=input.nextInt();
            matrixA=new int[m][n];
            matrixB=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    matrixA[i][j]=input.nextInt();
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    matrixB[i][j]=input.nextInt();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("---------------MENU----------------\n" +
                            "1.Tính tổng số Fibonacci\n" +
                            "2.Hiển thị ma trận\n" +
                            "3.tính tổng hai ma trận\n" +
                            "4.tính tích hai ma trận\n" +
                            "5.EXIT\n");
        Scanner sc = new Scanner(System.in);
        int op=0;
        while(op!=5){
            op = sc.nextInt();
            switch (op){
                case 1:
                {
                    System.out.println("Tính tổng dãy số Fibonacci : ");
                    int fi=sc.nextInt();
                    System.out.println(sum_fibonacci(fi));
                    break;
                }
                case 2:
                {
                    Matrix.PrintMatrix(matrixA,matrixB,m,n);
                    break;
                }
                case 3:
                {
                    Matrix.MatrixAddition(matrixA,matrixB,m,n);
                    break;
                }
                case 4:
                {
                    Matrix.MatrixMultiply(matrixA,matrixB,m,n);
                    break;
                }
                case 5:
                    return;
                default:
                {
                    System.out.println("Mời bạn nhập lại !");
                    op= sc.nextInt();
                    break;
                }

            }
        }
    }


}
