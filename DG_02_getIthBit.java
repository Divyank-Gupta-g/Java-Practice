package com.practice.bitManipulation;

import java.util.Scanner;

public class DG_02_getIthBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Bit position: ");
        int i = sc.nextInt();

        System.out.println(i + "th bit in the binary representation of " + n + " = " + getBit(n, i));
    }

    private static int getBit(int n, int i){
        int bitMask = (1<<i);
        if((n & bitMask) == 0){
            return 0;
        }
        return 1;
    }
}
