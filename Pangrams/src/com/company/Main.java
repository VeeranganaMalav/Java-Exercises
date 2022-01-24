package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String lowerString = input.toLowerCase();
        lowerString = lowerString.replace(" ", "");

        System.out.println("Pangram or not: " + pangrams(lowerString));
    }

    public static String pangrams(String s){

        Set<Character> characterSet = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            characterSet.add(s.charAt(i));
        }

        if (characterSet.size() != 26)
            return "NO";
        else
            return "YES";

    }
}
