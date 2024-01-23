package com.practice.strings;

import java.util.Scanner;

public class DG_01_palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word or string: ");
        String str = sc.nextLine();

        if(palindromeCheck(str)){
            System.out.println("'" + str + "' is palindrome.");
        }
        else{
            System.out.println("'" + str + "' is not a palindrome.");
        }
    }

    private static boolean palindromeCheck(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
