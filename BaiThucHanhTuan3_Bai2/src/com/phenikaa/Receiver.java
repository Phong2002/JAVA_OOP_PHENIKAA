package com.phenikaa;

import java.util.Scanner;

class Receiver implements Runnable{
    public Scanner scanner = new Scanner(System.in);
    Bank acc;
    int tienRut;
    Thread t;
    Receiver(Bank acc){
        this.acc = acc;
        t = new Thread(this, "Receiver");
    }
    public void run(){
        while(true){
            int tienRut = scanner.nextInt();
            acc.rutTien(tienRut);
        }
    }
}