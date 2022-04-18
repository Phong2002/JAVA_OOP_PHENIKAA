package com.phenikaa;

public class Vector {
    private double x;
    private double y;
    private double z;

    Vector(Point3D pointA,Point3D pointB){
        x=pointB.getX()-pointA.getX();
        y=pointB.getY()-pointA.getY();
        z=pointB.getZ()-pointA.getZ();
    }

    public Vector() {
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static Vector VectorPhapTuyen(Vector a,Vector b ){
        Vector vector = new Vector();
        vector.setX(a.getY()*b.getZ()-a.getZ()*b.getY());
        vector.setY(a.getZ()*b.getX()-a.getX()*b.getZ());
        vector.setZ(a.getX()*b.getY()-a.getY()*b.getX());
        return vector;
    }

}
