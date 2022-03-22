//This program prints fibonacci series using loops and recursion
package com.company;

import java.util.Scanner;

public class FibonacciSeries {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Press 1. Fibonacci series using loop \n\t 2. Fibonacci series using recursion");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter the first term of fibonacci series: ");
                int firstTerm = scanner.nextInt();
                System.out.print("Enter your second term of fibonacci series: ");
                int secondTerm = scanner.nextInt();
                System.out.println("Fibonacci series using loop");
                fibonacci(firstTerm, secondTerm);
                break;
            case 2:
                System.out.print("Enter the number of terms to be printed in fibonacci series: ");
                int count = scanner.nextInt();
                int term = 0;
                for (int i=1; i<=count; i++){
                    System.out.println(fibonacci(term));
                    term++;
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }

    public static void fibonacci(long firstTerm,long secondTerm){
        long thirdTerm;
        int i=1;
        System.out.print("Enter te number of terms to be printed in fibonacci series: ");
        int count = scanner.nextInt();

        System.out.println("Fibonacci series");
        System.out.println(firstTerm);
        System.out.println(secondTerm);
        while(i<=(count-2)){
            thirdTerm = firstTerm + secondTerm;
            System.out.println(thirdTerm);
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            i++;
        }
    }

    public static int fibonacci(int number){
        if(number == 0 || number == 1)
            return number;
        else{
           return fibonacci(number-1) + fibonacci(number-2);
        }
    }

}
