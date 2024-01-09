package com.practice.arrays;

import java.util.Scanner;

public class DG_01_linearSearch {
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

        int result = linearSearch(arr, k);

        if(result==-1){
            System.out.println("Not found.");
        }
        else{
            System.out.println(k + " is found in given array at index: " + result);
        }
    }

    public static int linearSearch(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }

        return -1;
    }
}
