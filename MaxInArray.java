package com.mycompany.maxinarray;

import java.util.Scanner;

public class MaxInArray {
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

        //find largest element in 2d array :
        int max = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Largest element in 2D array is = " + max);

    }
}
