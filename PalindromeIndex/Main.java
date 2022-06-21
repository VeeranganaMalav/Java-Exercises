package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int numberOfTestCases = scanner.nextInt();

        for (int i=1; i<=numberOfTestCases; i++){
            System.out.println("Enter the string for test case #" + i + ": ");
            String s = scanner.next();
            System.out.println("Index to be removed to make the string palindrome is : " + palindromeIndex(s));
        }

    }

    public static int palindromeIndex(String s){
        for(int i=0, j=s.length()-1; i<s.length()/2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                String si = (new StringBuilder(s)).deleteCharAt(i).toString();
                String sj = (new StringBuilder(s)).deleteCharAt(j).toString();
                if (isPalindrome(si))
                    return i;
                else if (isPalindrome(sj))
                    return j;
                else
                    return -1;
            }
        }
        return -1;
    }

    public static boolean isPalindrome(String str){
        String reversedString = (new StringBuffer(str)).reverse().toString();
        return reversedString.equals(str);
    }
}
