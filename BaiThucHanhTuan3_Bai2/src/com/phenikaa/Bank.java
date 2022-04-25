package com.phenikaa;

public class Bank {
    private int taiKhoan;
    private int tienNop;
    private int tienRut;
    private String customerName;
    private String customerID;
    boolean valueSet = false;

    public Bank(int taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    public synchronized void napTien(int tienNop){
        while(valueSet)
            try {
                wait();
            }catch (Exception e){
                System.out.println(e);
            }
        if(getTaiKhoan() >= tienNop){
            System.out.println(Thread.currentThread().getName() + " So tien nop vao la: " + tienNop);
            try {
                Thread.sleep(1000);
            }catch (Exception ex){
            }
            this.tienNop = tienNop;
            setTaiKhoan(getTaiKhoan() + tienNop);
            display();
            System.out.println(Thread.currentThread().getName() + " complate the desposit of " + tienNop);
        }else{
            System.out.println("Khong du so tien toi thieu can nap " + Thread.currentThread().getName() + " de rut " + getTaiKhoan());
        }
        valueSet = true;
        notify();
    }

    public int getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(int taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public int getTienNop() {
        return tienNop;
    }

    public void setTienNop(int tienNop) {
        this.tienNop = tienNop;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getTienRut() {
        return tienRut;
    }

    public void setTienRut(int tienRut) {
        this.tienRut = tienRut;
    }

    public synchronized int rutTien(int tienRut){
        while(!valueSet)
            try {
                wait();
            }catch (Exception e){
                System.out.println(e);
            }
        if(tienRut != 0 && tienRut <= getTaiKhoan()){
            System.out.println("Bat dau rut tien: " + tienRut);
            taiKhoan = taiKhoan - tienRut;

            setTaiKhoan(taiKhoan);
            display();
        }else{
            System.out.println("Khong the rut tien");
        }
        valueSet = false;
        notify();
        return tienRut;
    }
    public synchronized void display(){
        System.out.println("So du tai khoan la: " + taiKhoan);
    }
}
