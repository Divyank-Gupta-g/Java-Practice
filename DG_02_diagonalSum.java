package com.practice.twoDimensionalArray;

import java.util.Scanner;

public class DG_02_diagonalSum {
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

        System.out.print("Diagonal Sum: " + diagonalSum(arr));
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

//    private static int diagonalSum(int[][] arr){
//        int sum=0;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[0].length; j++){
//                if(i==j || (i+j)==arr.length-1){              // primary diagonal || secondary diagonal
//                    sum += arr[i][j];
//                }
//            }
//        }
//        return sum;
//    }

    private static int diagonalSum(int[][] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            //primary diagonal
            sum += arr[i][i];

            //secondary diagonal
            if(i != arr.length-1-i){
                sum += arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
}
