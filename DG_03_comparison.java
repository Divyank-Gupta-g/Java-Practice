package com.practice.strings;

public class DG_03_comparison {
    public static void main(String[] args){
        String s1 = "John";
        String s2 = "John";
        String s3 = new String("John");

        if(s1 == s2){
            System.out.println("s1 and s2 are equal.");
        }
        else{
            System.out.println("s1 and s2 are not equal.");
        }

        if(s1 == s3){
            System.out.println("s1 and s3 are equal.");
        }
        else{
            System.out.println("s1 and s3 are not equal.");
        }

        if(s1.equals(s2)){
            System.out.println("s1 and s2 are equal.");
        }
        else{
            System.out.println("s1 and s2 are not equal.");
        }

        if(s1.equals(s3)){
            System.out.println("s1 and s3 are equal.");
        }
        else{
            System.out.println("s1 and s3 are not equal.");
        }
    }
}
