package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int numberOfElements = scanner.nextInt();

        System.out.println("Enter the elements in the array: ");
        List<Integer> array = new ArrayList<>();
        for (int i=0; i<numberOfElements; i++){
            array.add(scanner.nextInt());
        }

        System.out.println("Median of the array is: " + findMedian(array));
    }

    public static double findMedian(List<Integer> arr){
        Integer[] array = arr.toArray(new Integer[0]);
        int length = arr.size();

        Arrays.sort(array);

        if (length % 2 != 0)
            return (double)(array[(length/2)]);
        else
            return ((double) (array[(length / 2) - 1] + array[length / 2]) / 2 );
    }
}
