package com.mycompany.asci;

import java.util.Scanner;

public class ASCI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ASCII Value (number): ");
        int asci = input.nextInt();//has int number (decimal)
        //to be ensure that char entered in asci table and has decimal value 
        if (asci >= 0 && asci <= 127) {
            char ch = (char) asci;//doing( explicit casting) to conver integer number to char and store in char variable 
            System.out.println("\nThe character is \'" + ch + "\'");
        } else {//if user enter decimal number not in asci table 
            System.out.println("invalid asci code !!");
        }
    }

}
