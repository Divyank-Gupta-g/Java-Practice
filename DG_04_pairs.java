package com.practice.arrays;

import java.util.Scanner;

public class DG_04_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("All possible pairs: ");
        pairs(arr);
    }

    public static void pairs(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + ", " + arr[j] + ")" +"\t");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + count);
    }
}
