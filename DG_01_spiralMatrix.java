package com.practice.twoDimensionalArray;

import java.util.Scanner;

public class DG_01_spiralMatrix {
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

        System.out.println("Spiral: ");
        spiral(arr);
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

    private static void spiral(int[][] arr){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(arr[startRow][j] + ", ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(arr[i][endCol] + ", ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(endRow==startRow){
                    break;
                }
                System.out.print(arr[endRow][j] + ", ");
            }

            //right
            for(int i=endRow-1; i>=startRow+1; i--){
                if(endCol==startCol){
                    break;
                }
                System.out.print(arr[i][startCol] + ", ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
}
