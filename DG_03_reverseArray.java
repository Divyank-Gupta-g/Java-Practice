package com.practice.arrays;

import java.util.Scanner;

public class DG_03_reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr);
        System.out.print("Reversed array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void reverse(int[] arr){
        int first = 0;
        int last = arr.length-1;

        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
}
