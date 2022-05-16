package com.phenikaa;

public class Main {

    public static void main(String[] args) {
        SoPhuc soPhuc1 = new SoPhuc(0, 15);
        SoPhuc soPhuc2 = new SoPhuc(1, 14);
        SoPhuc soPhuc3 = new SoPhuc(6, 99);
        SoPhuc soPhuc4 = new SoPhuc(68, 68);
        SoPhuc soPhuc5 = new SoPhuc(49, 0);

        System.out.println("In ra cac so phuc : ");
        System.out.println(soPhuc1);
        System.out.println(soPhuc2);
        System.out.println(soPhuc3);
        System.out.println(soPhuc4);
        System.out.println(soPhuc5);

        System.out.println("Cong 2 so phuc : "+soPhuc1+" va " +soPhuc2 + "= ");
        System.out.println(soPhuc1.add(soPhuc2));

        System.out.println("Tru 2 so phuc : "+soPhuc4+" va "+soPhuc1+" = ");
        System.out.println(soPhuc4.sub(soPhuc1));

        System.out.println("Nhan 2 so phuc " +soPhuc2+" va "+soPhuc4 + " = ");
        System.out.println(soPhuc2.multi(soPhuc4));

        System.out.println("Chia 2 so phuc "+soPhuc2+" va "+soPhuc3+" = ");
        System.out.println(soPhuc2.div(soPhuc3));

        System.out.println("Nhan so phuc "+soPhuc4+" voi so thuc 9 =");
        System.out.println(soPhuc4.multi(9));

        System.out.println("Phuong thuc lien hop cua so phuc "+soPhuc4+" = ");
        System.out.println(soPhuc4.ConjugateComplex());


    }
}
