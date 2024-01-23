package com.practice.strings;

import java.util.Scanner;

public class DG_04_subString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter first index (included): ");
        int si = sc.nextInt();
        System.out.print("Enter last index (excluded): ");
        int ei = sc.nextInt();

        System.out.println("Substring: " + sub(str, si, ei));
        System.out.println("Substring: " + str.substring(si, ei));
    }

    private static String sub(String str, int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
}
