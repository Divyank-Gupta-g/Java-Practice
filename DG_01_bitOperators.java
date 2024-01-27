package com.practice.bitManipulation;

import java.util.Scanner;

public class DG_01_bitOperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println(a + " & " + b + " = " + (a&b));
        System.out.println(a + " | " + b + " = " + (a|b));
        System.out.println("~" + a + " = " + (~a));
        System.out.println(a + " << " + b + " = " + (a<<b));
        System.out.println(a + " >> " + b + " = " + (a>>b));
    }
}
