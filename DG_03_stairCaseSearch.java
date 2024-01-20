package com.practice.twoDimensionalArray;

import java.util.Scanner;

public class DG_03_stairCaseSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter elements (row - wise): ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix: ");
        printArray(arr);

        System.out.print("Enter the element you want to search: ");
        int key = sc.nextInt();

        stair(arr, key);
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

    private static boolean stair(int[][] arr, int key){
        int row = 0;
        int col = arr[0].length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.println(key + " is found at index: (" + row + ", " + col + ")");
                return true;
            }
            else if(key > arr[row][col])
                row++;
            else
                col--;
        }
        System.out.println(key + " is not found in given matrix.");
        return false;
    }
}
