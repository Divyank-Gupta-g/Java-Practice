package com.practice.arrays;

import java.util.Scanner;

public class DG_08_MaxSubArraySumKadane {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        kadane(arr);
    }

    public static void kadane(int[] arr){
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            curr += arr[i];
            if(curr < 0){
                curr = 0;
            }
            max = Math.max(curr, max);
        }

        System.out.println("Maximum sub array sum is: " + max);
    }
}
