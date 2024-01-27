package com.practice.bitManipulation;

import java.util.Scanner;

public class DG_10_powerOf2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print(n + " is power of 2: " + checkPower(n));
    }

    private static boolean checkPower(int n){
        return ((n & (n-1)) == 0);
    }
}
