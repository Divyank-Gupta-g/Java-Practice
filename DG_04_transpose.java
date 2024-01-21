package com.practice.twoDimensionalArray;

import java.util.Scanner;

public class DG_04_transpose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows or columns: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        System.out.println("Enter elements (row - wise): ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix: ");
        printArray(arr);

        System.out.println("Transpose matrix: ");

        transpose(arr);
        printArray(arr);
    }

    private static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
