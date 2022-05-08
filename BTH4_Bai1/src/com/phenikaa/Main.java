package com.phenikaa;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void ShortArr(double[] arrD){
        int n = arrD.length;
        double temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arrD[j-1] > arrD[j]){
                    temp = arrD[j-1];
                    arrD[j-1] = arrD[j];
                    arrD[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {

    double []doubleList= {0.15d,1d,5.8d,48d,3.5d,85d,6.5d,5.9d,69d,58d};
        try
        {
            FileWriter dayso = new FileWriter("./dayso.txt");

            for(double x:doubleList){
                dayso.write(String.valueOf(x+" "));
            }
            dayso.close();
        }
        catch (Exception e)
        {
            System.out.println("IOException : " + e);
        }


        try
        {
            Scanner myReader = new Scanner(new File("./dayso.txt"));

            int n=10;
            double []doubles = new double[n];
            for(int i=0;i<n;i++){
                doubles[i]=myReader.nextDouble();
            }

            ShortArr(doubles);
            FileWriter outputSapXep = new FileWriter("./sapxep.txt");
            for(double db:doubles){
                outputSapXep.write(db+" ");
            }
            outputSapXep.close();
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }


    }
}
