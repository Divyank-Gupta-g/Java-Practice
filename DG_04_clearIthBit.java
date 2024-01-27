package com.practice.bitManipulation;

import java.util.Scanner;

public class DG_04_clearIthBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter bit position: ");
        int i = sc.nextInt();

        System.out.print("After clearing " + i +"th bit in the given number " + n + " = " + clearBit(n, i));
    }

    private static int clearBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
}
