package com.practice.bitManipulation;

import java.util.Scanner;

public class DG_06_oddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        oddEven(n);
    }

    private static void oddEven(int n){
        int bitMask = 1;

        if((n & bitMask) == 0){
            System.out.print(n + " is an even number.");
        }
        else{
            System.out.print(n + " is an odd number.");
        }
    }
}
