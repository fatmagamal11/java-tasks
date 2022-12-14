package com.mycompany.transpose_matrix;

import java.util.Scanner;

public class Transpose_matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int res[][] = new int[3][3];
        int row, col;

        //scaning elements from user :
        System.out.print("enter the matrix elements : ");
        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        //printing array elements :
        System.out.print("The matrix elements are : ");
        printMatrix(arr);

        // finding transpose of the matrix :
        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                res[col][row] = arr[row][col];
            }
        }
        System.out.print("\n\nThe transpose of the matrix : ");
        printMatrix(res);
    }

//method to print matrix on screen :
    static void printMatrix(int arr[][]) {
        int row, col;
        for (row = 0; row < 3; row++) {
            System.out.print("\n");
            for (col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }
    }

}
