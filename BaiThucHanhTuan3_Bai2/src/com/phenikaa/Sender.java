package com.phenikaa;

import java.util.Scanner;

class Sender implements Runnable {
    Bank acc;
    Thread t;
    public Scanner scanner = new Scanner(System.in);

    Sender(Bank acc){
        this.acc = acc;
        t = new Thread(this,"Sender");
    }
    @Override
    public void run() {
        while(true){
            int tienNap = scanner.nextInt();
            acc.napTien(tienNap);
        }
    }
}
