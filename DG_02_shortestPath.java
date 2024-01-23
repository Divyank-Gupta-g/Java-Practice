/* Given a route containing four directions (N, S, E, W).
    Suppose journey is started from origin.
    Find the shortest path to reach the destination.
 */

package com.practice.strings;

import java.util.Scanner;

public class DG_02_shortestPath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complete path (in capital letters): ");
        String path = sc.next();

        System.out.println("Displacement: " + shortest(path));
    }

    private static float shortest(String str){
        int x=0, y=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
            else if(str.charAt(i) == 'W'){
                x++;
            }
            else if(str.charAt(i) == 'E'){
                x--;
            }
        }

        return (float)Math.sqrt((x*x) + (y*y));
    }
}
