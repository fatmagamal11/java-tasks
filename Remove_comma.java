/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.remove_comma;

import java.util.Scanner;

/**
 *
 * @author Tweety
 */
public class Remove_comma {

    public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.print("please enter statment to remove all comma from it :");
        java.lang.String statment = input.nextLine();//recieving string 
     //statment = statment.toLowerCase();
        for (int i =0; i <statment.length(); ++i) {//looping into string as array of chars
            char ch = statment.charAt(i);
            if (ch == 44) {
                System.out.print("");
            }else 
            str = str + ch;
        }
        System.out.println(str);
    }
}
