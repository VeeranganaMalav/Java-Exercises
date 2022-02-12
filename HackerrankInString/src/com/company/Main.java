//This program checks if given string contains the word hackerrank if a subsequence of its characters spell the word hackerrank such that a subsequence maintains the order of characters.For each query, print YES if the string contains hackerrank, otherwise, print NO.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.next();

        System.out.println("The given string contains hackerrank: " + hackerrankInString(input));
    }

    public static String hackerrankInString(String s){

        String hackerrank = "hackerrank";
        int flag = 0;

        int i=0;
        int j =0;

        while(i<hackerrank.length()){
            while(j<s.length()){
                if (hackerrank.charAt(i) == s.charAt(j)){
                    flag++;
                    j++;
                    break;
                }
                j++;
            }
            i++;
        }

        if (flag == 10){
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
