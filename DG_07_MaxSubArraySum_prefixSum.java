package com.practice.arrays;

import java.util.Scanner;

public class DG_07_MaxSubArraySum_prefixSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        prefix(arr);
    }

    public static void prefix(int[] arr){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];
        for(int i=1; i<prefixSum.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                curr = (i==0) ? prefixSum[j] : prefixSum[j]-prefixSum[i-1];

                if(max<curr){
                    max = curr;
                }
            }
        }
        System.out.println("Maximum Subarray sum: " + max);
    }
}
