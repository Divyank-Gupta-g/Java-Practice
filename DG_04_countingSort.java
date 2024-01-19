package com.practice.Sorting;

import java.util.Scanner;

public class DG_04_countingSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Sorted array: ");
        countingSort(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr){
        for(int a : arr){
            System.out.print(a + "\t");
        }
    }

    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int a : arr){
            largest = Math.max(largest, a);
        }

        int[] count = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
