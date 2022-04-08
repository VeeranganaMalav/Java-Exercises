//Given a string s[i] , find and print the minimum cost of copying each s[i] to p[i]

package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scanner.next();

        System.out.println("Total cost for string construction: " + stringConstruction(str));
    }

    public static int stringConstruction(String s){

        Set<Character> p = new HashSet<>();
        for (int i=0; i<s.length(); i++){

            for (char c : s.toCharArray()){
                p.add(c);
            }

        }

        return p.size();
    }
}
