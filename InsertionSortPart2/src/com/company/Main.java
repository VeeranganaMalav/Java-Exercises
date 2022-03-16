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

        insertionSort2(numberOfElements, unsortedArray);
    }

    public static void insertionSort2(int n, List<Integer> arr){
        Integer[] unsortedArray = arr.toArray(new Integer[n]);


        int temp;
        for (int i=1; i<unsortedArray.length; i++){

            int j = i-1;
            temp = unsortedArray[i];
            while (j>=0 && unsortedArray[j] > temp){

                unsortedArray[j+1] = unsortedArray[j];
                unsortedArray[j] = temp;
                temp = unsortedArray[j];
                j--;
            }
            printArray(unsortedArray);
        }
    }

    public static void printArray(Integer[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
