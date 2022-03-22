package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for prime check: ");
        int number = scanner.nextInt();
        System.out.println("The number is prime: " + isPrime(number));
        /*int flag = 0;
        System.out.println("Enter first limit: ");
        int firstLimit = scanner.nextInt();

        System.out.println("Enter first limit: ");
        int secondLimit = scanner.nextInt();

        for (int i=firstLimit; i<secondLimit; i++){
            for (int j=2; j<i; j++){
                if (i%j == 0){
                    flag = 0;
                    break;
                }
                else
                    flag = 1;
            }
            if(flag == 1 || i==2)
                System.out.println(i);
        }*/

    }

    public static boolean isPrime(int number){
        int flag = 0;
        for (int i=2; i<number; i++){
            if (number%i == 0)
                break;
            else
                flag = 1;
        }
        return flag == 1 || number == 2;
    }
}
