package com.phenikaa;

    public class Vector {
        private int n;
        private double[] arr;

        public Vector() {
            n = 0;
            arr = new double[n];
        }

        public Vector(int n) {
            this.n = n;
            arr = new double[n];
        }

        public Vector(double[] a) {
            this.n = a.length;
            arr = a;
        }

        public int getLength() {
            return arr.length;
        }

        public double[] add(Vector x) {
            if(x.getLength() < arr.length) {
                return arr;
            }
            for(int i = 0; i < arr.length; i++) {
                arr[i] += x.arr[i];
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return arr;
        }

        public double[] sub(Vector x) {
            if(x.getLength() < arr.length) {
                return arr;
            }
            for(int i = 0; i < arr.length; i++) {
                arr[i] -= x.arr[i];
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return arr;
        }

        public double calcLen() {
            double sum = 0;
            for (double d : arr) {
                sum += Math.pow(d, 2);
            }
            System.out.println(Math.sqrt(sum));
            return Math.sqrt(sum);
        }

        public double[] multi(double x) {
            for (double d : arr) {
                d = d * x;
                System.out.print(d + " ");
            }
            System.out.println();
            return arr;
        }

        public void print() {
            for (double d : arr) {
                System.out.println(d);
            }
        }

        public Vector calcUnitVector() {
            double[] temp = new double[n];
            double temp2 = 0;
            for (double d : arr) {
                temp2 += (d * d);
            }
            temp2 = Math.sqrt(temp2);
            int i = 0;
            for (double d : arr) {
                temp[i] = d / temp2;
                System.out.print(temp[i] + " ");
                i++;
            }

            Vector vDonVi = new Vector(temp);
            return vDonVi;
        }

        public String toString() {
            String temp = "\n(";
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    temp += arr[i] + ")\n";
                    return temp;
                }
                temp += Double.toString(arr[i]) + ", ";
            }
            return temp;
        }
    }




