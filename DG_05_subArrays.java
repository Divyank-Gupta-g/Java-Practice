package com.practice.arrays;

import java.util.Scanner;

public class DG_05_subArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("All possible Sub Arrays: ");
        subArray(arr);
    }

    public static void subArray(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + ", ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub arrays: " + count);
    }
}
