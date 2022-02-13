//Given the string, find the minimum number of characters that must be added to make the password strong

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of characters of the password entered: ");
        int charactersInEnteredPassword = scanner.nextInt();

        System.out.println("Enter the password string: ");
        String password = scanner.next();

        System.out.println("Number of characters required for strong password: " +
                minimumNumberForStrongPassword(charactersInEnteredPassword, password));
    }

    public static int minimumNumberForStrongPassword(int n, String password){
        int charactersRequired = 0;

        boolean lowercase = false;
        boolean uppercase = false;
        boolean number = false;
        boolean special = false;
        char[] specialCharacters = "!@#$%^&*()-+".toCharArray();
        Set<Character> characterSet = new HashSet<>();

        for (char c : specialCharacters) {
            characterSet.add(c);
        }

        for (int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if (c >= '0' && c <= '9')
                number = true;
            if (c >= 'a' && c <= 'z')
                lowercase = true;
            if (c >= 'A' && c <= 'Z')
                uppercase = true;
            if (characterSet.contains(c))
                special = true;
        }

        charactersRequired += lowercase ? 0 : 1;
        charactersRequired += uppercase ? 0 : 1;
        charactersRequired += number ? 0 : 1;
        charactersRequired += special ? 0 : 1;

        return n + charactersRequired < 6 ? 6 - n : charactersRequired;

    }
}
