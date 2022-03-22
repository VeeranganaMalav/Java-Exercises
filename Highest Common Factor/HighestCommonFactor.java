//This program finds greatest common divisor for two numbers or an array of integers
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HighestCommonFactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1. Calculating gcd of two numbers \n 2. Calculating gcd of an array of integers");
        System.out.println("Enter your choice: ");
        int ch = scanner.nextInt();

        switch(ch){
            case 1:
                System.out.println("Enter the value of first number: ");
                int firstNum = scanner.nextInt();
                System.out.println("Enter the value of second number: ");
                int secondNum = scanner.nextInt();
                System.out.println("Greatest common divisor of " + firstNum + " and " + secondNum + " is " + gcd(firstNum, secondNum));
                break;

            case 2:
                System.out.print("Enter the length of array : ");
                int length = scanner.nextInt();
                int[] array = new int[length];
                for (int i=0; i<length; i++){
                    System.out.print("Enter element " + (i+1) + ": ");
                    array[i] = scanner.nextInt();
                }
                System.out.println("Array : " + Arrays.toString(array));
                System.out.println("Greatest common divisor of array is " + gcd(array));
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }

    public static int gcd(int firstNum,int secondNum){
        int smallest;
        int hcf=1;
        if (firstNum<secondNum)
            smallest = firstNum;
        else
            smallest = secondNum;
        for (int i=smallest; i>=1; i--){
            if (firstNum%i==0 && secondNum%i==0) {
                hcf = i;
                break;
            }
        }
        return hcf;
        /*if(firstNum == 0){
            return secondNum;
        }
        else{
            return gcd(secondNum%firstNum, firstNum);
        }*/
    }

    public static int gcd(int[] array){
        int result = 0;
        for (int i=0; i<array.length-1; i++){
           result =  gcd(array[i], array[i+1]);
        }
        return result;
    }

}
