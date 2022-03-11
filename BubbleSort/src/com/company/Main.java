package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in array: ");
        int numberOfElements = scanner.nextInt();

        System.out.println("The elements in the array before sorting are: ");
        int[] intArray = new int[numberOfElements];
        for (int i=0; i<numberOfElements; i++){
            intArray[i] = scanner.nextInt();
        }

        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++){
                if (intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        System.out.println("The elements in the array after sorting are: ");
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){

        if (i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
