package com.practice.bitManipulation;

import java.util.Scanner;

public class DG_08_clearRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Starting index: ");
        int i = sc.nextInt();
        System.out.print("Ending index: ");
        int j = sc.nextInt();

        System.out.println("After clearing bits from " + i + " to " + j + " in binary representation, " + n + " becomes: " + clearRange(n, i, j));
    }

    private static int clearRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = ((1<<i)-1);
        int bitMask = a | b;
        return (n & bitMask);
    }
}
