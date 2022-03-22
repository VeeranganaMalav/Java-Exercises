//This program encrypts a string by shifting the alphabets of the string by a number of letters

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter unencrypted string: ");
        String unencryptedString = scanner.next();

        System.out.println("Enter the shifting number: ");
        int shift = scanner.nextInt();

        System.out.println("Encrypted string is: " + caesarCipher(unencryptedString, shift));
    }

    public static String caesarCipher(String s, int k){

        StringBuilder encryptedString = new StringBuilder();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0; i<s.length(); i++){
            if( (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ){
                alphabets = (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ?  alphabets.toUpperCase() : alphabets.toLowerCase() ;
                int shiftedIndex = alphabets.indexOf(s.charAt(i)) + k;
                if (shiftedIndex > 25){
                    shiftedIndex -= 26;
                }
                encryptedString.append(alphabets.charAt(shiftedIndex));
            }
            else {
                encryptedString.append(s.charAt(i));
            }
        }

        return encryptedString.toString();
    }
}
