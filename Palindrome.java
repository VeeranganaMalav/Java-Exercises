//This program whether a number and a string is palindrome or not
package com.company;

import java.util.Scanner;

public class Palindrome {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Number is palindrome: "+ palindrome(number));

        System.out.println("Enter a string: ");
        String string = scanner.next();
        System.out.println("String is palindrome: "+ palindrome(string));

    }

    public static boolean palindrome(int number){
        int originalNumber = number;
        int remainder,reverse = 0;
        while(number != 0){
            remainder = number%10;
            reverse = (reverse*10) + remainder;
            number = number/10;
        }
        return reverse == originalNumber;
    }

    public static boolean palindrome(String str){
        char[] charArray = str.toCharArray();
        char[] reversedCharArray = new char[charArray.length];
        for (int i= charArray.length-1; i>=0; i--){
            reversedCharArray[charArray.length-i-1] = charArray[i];
        }
        System.out.println("Reversed string is " + String.valueOf(reversedCharArray));
        return (String.valueOf(reversedCharArray)).equals(String.valueOf(charArray));
    }
}
