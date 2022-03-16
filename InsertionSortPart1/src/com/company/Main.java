package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array: ");
        int numberOfElements = scanner.nextInt();

        List<Integer> unsortedArray = new ArrayList<>();

        System.out.println("Enter the elements in the array: ");
        for (int i=0; i<numberOfElements; i++){
            unsortedArray.add(scanner.nextInt());
        }

        insertionSort1(numberOfElements, unsortedArray);
    }

    public static void insertionSort1(int n, List<Integer> arr){
        Integer[] unsortedArray = arr.toArray(new Integer[n]);
        /*int element = unsortedArray[unsortedArray.length-1];

        int i = unsortedArray.length-2;
        while (element < unsortedArray[i]){
            unsortedArray[i+1] = unsortedArray[i];
            i--;
            for (int j : Arrays.asList(unsortedArray)){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        unsortedArray[i+1] = element;

        for (int j : Arrays.asList(unsortedArray)){
            System.out.print(j + " ");
        }*/

        int temp;
        for (int i= unsortedArray.length-1; i>0; i--){
            temp = unsortedArray[i];

            if (unsortedArray[i-1] > temp){
                unsortedArray[i] = unsortedArray[i-1];
                printArray(unsortedArray);

                unsortedArray[i-1] = temp;
            }
        }

        printArray(unsortedArray);
    }

    public static void printArray(Integer[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
