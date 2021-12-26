package com.company;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Enter the value to be searched: ");
        int value = scanner.nextInt();

        System.out.println("Index of the value to be searched: " + linearSearch(intArray, value));
    }

    public static int linearSearch(int[] array, int value){
        for (int i=0; i< array.length; i++){
            if (array[i] == value)
                return i;
        }
        return -1;
    }
}
