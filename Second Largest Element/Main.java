package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in array: ");
        int numberOfElements = scanner.nextInt();

        int[] array = new int[numberOfElements];
        System.out.println("Enter the elements in array: ");
        for (int i=0; i<numberOfElements; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Second largest element in array is: " + secondLargestWithoutSorting(array));

	    scanner.close();
    }

    public static int secondLargestWithoutSorting(int[] array){
        int arraySize = array.length;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        if (arraySize < 2)
            return Integer.MIN_VALUE;

        for (int i=0; i<arraySize; i++){

            if (array[i] > first){
                second = first;
                first = array[i];
            }
            else if (array[i] > second && array[i] != first){
                second = array[i];
            }
        }

        return second;
    }
}
