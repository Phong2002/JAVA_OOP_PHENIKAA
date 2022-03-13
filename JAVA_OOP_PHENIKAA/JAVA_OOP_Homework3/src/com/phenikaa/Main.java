package com.phenikaa;

public class Main {

    public static double KhoangCach(Point a,Point b){
        double d1=Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
        return d1;
    }

    public static boolean KiemTraThangHang(Point a,Point b,Point c){
        double d1=KhoangCach(a,b);
        double d2=KhoangCach(a,c);
        double d3=KhoangCach(b,c);
        if((d1==(d2+d3))||(d2==(d1+d3))||(d3==(d1+d2))){
            return true;
        }
        return false;
    }

    public static double DienTich(Point a,Point b,Point c){
        if(KiemTraThangHang(a,b,c)){
            System.out.println("Khong tinh duoc !");
            return 0;
        }
        double p = ChuVi(a,b,c)/2d;

        return Math.sqrt(p*(p-KhoangCach(a,b))*(p-KhoangCach(b,c))*(p-KhoangCach(a,c)));
    }


    public static double ChuVi(Point a,Point b,Point c){
        if(KiemTraThangHang(a,b,c)){
            System.out.println("Khong tinh duoc !");
            return 0;
        }

        return KhoangCach(a,b)+KhoangCach(b,c)+KhoangCach(a,c);
    }


    public static void main(String[] args) {
        Point a = new Point(5,9);
        Point b = new Point(1,6);
        Point c = new Point(12,8);
        System.out.println(KiemTraThangHang(a,b,c)?"3 diem a b c thang hang":"3 diem a b c khong thang hang");
        System.out.printf("Khoang cach a b la : %.2f\n",KhoangCach(a,b));
        System.out.printf("Dien tich hinh tam giac la : %.2f\n",DienTich(a,b,c));
        System.out.printf("Chu vi hinh tam giac la : %.2f\n",ChuVi(a,b,c));


        Stack stack = new Stack(5); // Khoi tao stack voi max 5 phan tu

        stack.push(12);
        stack.push(5);
        stack.push(85);
        stack.push(65);
        stack.push(48);

        System.out.println("Peek : "+stack.peek());
        System.out.println("Pop : "+stack.pop());
        System.out.println(stack.isEmpty()?"Stack rong ":"Stack khong rong");
        System.out.println(stack.isFull()?"Stack day":"Stack chua day");
    }
}
