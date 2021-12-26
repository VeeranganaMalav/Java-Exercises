package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class KaprekarNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lower limit of the range");
        int lowerLimit  = scanner.nextInt();

        System.out.println("The upper limit of the range");
        int upperLimit = scanner.nextInt();

        kaprekarNumbers(lowerLimit, upperLimit);
    }

    public static void kaprekarNumbers(int p, int q){

        List<Long> sumArray = new ArrayList<>();

        long upperLimit = (long)(p);
        long lowerLimit = (long)(q);

        for (long i=upperLimit; i<=lowerLimit; i++){
            long square = i*i;
            int numberDigits = String.valueOf(i).length();

            if (i == 1L){
                sumArray.add(i);
            }
            else {
                int squareDigits = String.valueOf(square).length();

                String squareStr = String.valueOf(square);

                int index = squareDigits - numberDigits;

                if (index == 0){
                    continue;
                }

                long left = Long.valueOf(squareStr.substring(0, index));
                long right = Long.valueOf(squareStr.substring(index));

                if ( left+right == i){
                    sumArray.add(i);
                }
            }
        }

        System.out.println("The list of Kaprekar numbers in the given range:");
        if (sumArray.isEmpty()){
            System.out.println("INVALID RANGE");
        }
        else {
            ListIterator<Long> iterator = sumArray.listIterator();
            while(iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }
    }
}
