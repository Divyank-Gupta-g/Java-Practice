package com.practice.bitManipulation;

import java.util.Scanner;

public class DG_07_clearBits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of bits (from last) you want to clear: ");
        int i = sc.nextInt();

        System.out.println("After clearing last " + i + " bits from binary representation, " + n + " becomes: " + clearLast(n, i));
    }

    private static int clearLast(int n, int i){
        int bitMask = ((~0)<<i);
        return (n & bitMask);
    }
}
