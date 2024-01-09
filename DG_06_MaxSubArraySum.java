package com.practice.arrays;

import java.util.Scanner;

public class DG_06_MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxSum(arr);
    }

    public static void maxSum(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int currSum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + ", ");
                    currSum += arr[k];
                }
                System.out.println("CurrentSum: " + currSum);
                if(max<currSum){
                    max = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum Sub Array Sum: " + max);
    }
}
