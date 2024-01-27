package com.practice.bitManipulation;

import java.util.Scanner;

public class DG_11_countSetBits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Number of set bits in binary representation of " + n + ": " + countSet(n));
    }

    private static int countSet(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
