package com.phenikaa;

public class Matrix {
    public static void PrintMatrix(int matrixA[][],int matrixB[][],int m,int n){
        System.out.println("Ma trận A: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Ma trận B: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void MatrixMultiply(int matrixA[][],int matrixB[][],int m,int n){
        int matrixC[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixC[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    matrixC[i][j] = matrixC[i][j] + matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // hiển thị ma trận tích C
        System.out.println("Ma trận tích C: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void MatrixAddition(int matrixA[][],int matrixB[][],int m,int n){
        int matrixC[][] = new int[m][n];
        for(int i = 0; i<m; i++)
            for(int j = 0; j<n ; j++)
                matrixC[i][j] = matrixA[i][j]+matrixB[i][j];

        System.out.println("Ma trận tích C: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }


}
