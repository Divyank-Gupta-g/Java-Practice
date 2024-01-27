package com.practice.bitManipulation;

import java.util.Scanner;

public class DG_09_exponential {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter powers: ");
        int p = sc.nextInt();

        System.out.println(n + " to the power " + p + ": " + expo(n, p));
    }

    private static int expo(int n, int p){
        int ans = 1;

        while(p>0){
            if ((p & 1) != 0){
                ans = ans*n;
            }
            n = n*n;
            p = p>>1;
        }
        return ans;
    }
}
