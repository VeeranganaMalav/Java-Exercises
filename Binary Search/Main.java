package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements in the array: ");
        for (int i=0; i<length; i++){
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("Enter the element to be searched: ");
        int element = scanner.nextInt();

        System.out.println("Element is found at position " + binarySearch(array, length, element));
    }

    public static int binarySearch(int[] arr, int length, int element){
        int low = 0;
        int high = length-1;
        int position = -1;

        while(low<=high){
            int mid = (low + high)/2;

            if(element == arr[mid]){
                position = mid;
                break;
            }
            else if(element < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return position;
    }
}
