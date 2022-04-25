package com.phenikaa;

import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;

public class DigitalWatch implements Runnable {

    JFrame f;
    Thread t = null;
    String timeString = "";
    JButton b;


    DigitalWatch() {
        f = new JFrame();

        t = new Thread(this);
        t.start();

        b = new JButton();
        b.setBounds(100, 100, 100, 50);
        b.setBackground(Color.pink);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void run() {
        try {
            while (true) {
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
//                Date date = cal.getTime();
                timeString = formatter.format(new Date());
                printTime();
                t.sleep(1000);  // interval given in milliseconds
            }
        } catch (Exception e) {
        }
    }

    public void printTime() {
        b.setText(timeString);
    }

    public static void main(String[] args) {
        new DigitalWatch();
    }
}
