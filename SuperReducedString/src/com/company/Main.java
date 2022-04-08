/* Reduce a string of lowercase characters in range ascii[‘a’..’z’] by doing a series of operations.
In each operation, select a pair of adjacent letters that match, and delete them.
Delete as many characters as possible and return the resulting string. If the final string is empty, return Empty String */

 package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scanner.next();

        System.out.println("Final Result: " + superReducedString(str));
    }

    public static String superReducedString(String s){
        if (s.length() == 0){
            return "Empty String";
        }

        if (s.length()==1) {
            return s;
        }

        int flag = 0;

        for (int i=0; i<s.length()-1; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                s=s.substring(0,i)+s.substring(i+2);
                flag++;
            }
        }

        if (flag == 0) {
            return s;
        }

        return superReducedString(s);
    }
}
