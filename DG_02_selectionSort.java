package com.practice.Sorting;

import java.util.Scanner;

public class DG_02_selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    private static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){                    //change this sign for decreasing order
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
