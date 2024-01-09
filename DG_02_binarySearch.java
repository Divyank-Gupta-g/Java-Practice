package com.practice.arrays;

import java.util.Scanner;

public class DG_02_binarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int k = sc.nextInt();

        int result = binarySearch(arr, k);

        if(result==-1){
            System.out.println("Not found.");
        }
        else{
            System.out.println(k + " is found in given array at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }
}
