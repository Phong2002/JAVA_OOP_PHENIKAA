package com.phenikaa;

public class Main {

    public static void main(String[] args) {
        double[] a = {1,2,3,4};
        double[] b = {2, 3, 4, 5};
        Vector v = new Vector(a);
        Vector x = new Vector(b);
        System.out.println(v.toString());
        v.multi(5);
        v.calcLen();
        v.add(x);
        v.sub(x);
        v.multi(4);
        Vector vecDonVi = v.calcUnitVector();
        System.out.println(vecDonVi.toString());
    }
}
