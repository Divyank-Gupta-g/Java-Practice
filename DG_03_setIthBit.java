package com.practice.bitManipulation;

import java.util.Scanner;

public class DG_03_setIthBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter bit position: ");
        int i = sc.nextInt();

        System.out.print("After setting " + i +"th bit as 1 in the given number " + n + " = " + setBit(n, i));
    }

    private static int setBit(int n, int i){
        int bitMask = (1<<i);
        return n | bitMask;
    }
}
