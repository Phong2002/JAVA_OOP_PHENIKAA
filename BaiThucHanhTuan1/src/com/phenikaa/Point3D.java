package com.phenikaa;

public class Point3D extends Point{

    private double z;

    public Point3D(double x, double y,double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(Point3D point) {
        super(point);
        this.z =point.getZ();
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static void PrintPlaneEquation(Point3D a,Point3D b,Point3D c){

        Vector vector = PlaneEquation(a,b,c);

        System.out.println(vector.getX()+"x "+ vector.getY()+"y + "+ vector.getZ()+"z");
    }

    public static Vector PlaneEquation (Point3D a,Point3D b,Point3D c){
        Vector AB = new Vector(a,b);
        Vector BC = new Vector(b,c);

        Vector vector = Vector.VectorPhapTuyen(AB,BC);
        return vector;
    }

    public static boolean DiemTrongMatPhang(Vector vector,Point3D point){
        if(vector.getX()*point.getX()+ vector.getY()* point.getY()+ vector.getZ()* point.getZ()==0){
            return true;
        }
        return false;
    }
}
