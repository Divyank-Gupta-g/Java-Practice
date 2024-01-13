package com.practice.Sorting;

import java.util.Scanner;

public class DG_01_bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubble(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    private static void bubble(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
