package com.phenikaa;

public class Point {
    private double x;
    private double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this.x=point.getX();
        this.y=point.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double Distance(Point a,Point b){
        double d1=Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
        return d1;
    }

    public static void Equation(Point point1,Point point2){
        System.out.println("y=("+(point1.y-point2.y)+"x "+(point1.x* point2.y-point1.y-point2.x)+")/"+(point1.x- point2.x));
    }

    public static boolean straight(Point a,Point b,Point c){
        double d1=Distance(a,b);
        double d2=Distance(a,c);
        double d3=Distance(b,c);
        if((d1==(d2+d3))||(d2==(d1+d3))||(d3==(d1+d2))){
            return true;
        }
        return false;
    }

    public static double Acreage(Point a,Point b,Point c){
        if(straight(a,b,c)){
            System.out.println("Khong tinh duoc !");
            return 0;
        }
        double p = perimeter(a,b,c)/2d;

        return Math.sqrt(p*(p-Distance(a,b))*(p-Distance(b,c))*(p-Distance(a,c)));
    }

    public static double perimeter(Point a,Point b,Point c){
        if(straight(a,b,c)){
            System.out.println("Khong tinh duoc !");
            return 0;
        }

        return Distance(a,b)+Distance(b,c)+Distance(a,c);
    }
}