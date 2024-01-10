/*
 Given n non-negative integers representing an elevation map where the width of each bar is 1,
 compute how much water it can trap after raining.
*/

package com.practice.arrays;

import java.util.Scanner;

public class DG_09_TrappingRainWater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of bars: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the lengths of bars:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = rain(arr);
        System.out.println("Total volume of trapped water: " + result);
    }

    private static int rain(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        left[0] = arr[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(arr[i], left[i-1]);
        }

        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(arr[i], right[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int water = Math.min(left[i], right[i]);
            trappedWater += water - arr[i];
        }
        return trappedWater;
    }
}
