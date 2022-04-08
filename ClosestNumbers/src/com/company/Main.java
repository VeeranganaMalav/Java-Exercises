/*Given a list of unsorted integers, arr, find the pair of elements that have the smallest absolute difference
between them. If there are multiple pairs, find them all*/

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> unsortedArray = new ArrayList<>();
        System.out.println("Enter the number of elements in the array: ");
        int numberOfElements = scanner.nextInt();

        System.out.println("Enter the elements in the array: ");
        for (int i=0; i<numberOfElements; i++){
            unsortedArray.add(scanner.nextInt());
        }

        List<Integer> finalArray = closestNumbers(unsortedArray);
        System.out.println("The array having minimum difference is: " + finalArray.toString());
    }

    public static List<Integer> closestNumbers(List<Integer> arr){

        Collections.sort(arr);

        List<Integer> finalArray = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.size()-1; i++){
            min = Math.min(min, Math.abs(arr.get(i+1) - arr.get(i)));
        }

        for (int i=0; i< arr.size()-1; i++){
            if ( (Math.abs(arr.get(i+1) - arr.get(i))) == min){
                finalArray.add(arr.get(i));
                finalArray.add(arr.get(i+1));
            }
        }

        return finalArray;
    }
}
