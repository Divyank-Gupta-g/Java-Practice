/*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and 
    choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction.
    If you can not achieve any profit, return 0.
 */

package com.practice.arrays;

import java.util.Scanner;

public class DG_10_BuySellStocks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of days: ");
        int n = sc.nextInt();
        int[] price = new int[n];

        System.out.println("Enter the price for each day:");
        for(int i=0; i<n; i++){
            price[i] = sc.nextInt();
        }

        int result = stock(price);
        System.out.println("Maximum possible profit: " + result);
    }

    private static int stock(int[] arr) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<arr.length; i++){
            if(buy < arr[i]){
                int profit = arr[i] - buy;
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                buy = arr[i];
            }
        }

        return maxProfit;
    }
}
