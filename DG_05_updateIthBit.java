package com.practice.bitManipulation;

import java.util.Scanner;

public class DG_05_updateIthBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter bit position: ");
        int i = sc.nextInt();
        System.out.print("Enter updated bit: ");
        int u = sc.nextInt();

        System.out.print("After updating " + i +"th bit as " + u + " in the given number " + n + " = " + updatedBit(n, i, u));
    }

    private static int clearBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    private static int setBit(int n, int i){
        int bitMask = (1<<i);
        return n | bitMask;
    }

    private static int updatedBit(int n, int i, int u){
        if(u == 0){
            return clearBit(n, i);
        }
        else{
            return setBit(n, i);
        }

        /*
            n = clearBit(n, i);
            int bitMask = (u<<i);
            return (n | bitMask);
        */
    }
}
