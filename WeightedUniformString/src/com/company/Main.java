/*A uniform string consists of a single character repeated zero or more times. For example, ccc and a are uniform strings, but bcb and cd are not.
Given a string, s, let U be the set of weights for all possible uniform contiguous substrings of string s.
Create a return array where for each query, the value is Yes if query[i] belongs U. Otherwise, append No.*/

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.next();

        List<Integer> queries = new ArrayList<>();
        System.out.println("Enter the number of queries: ");
        int numberOfQueries = scanner.nextInt();

        System.out.println("Enter the queries: ");
        for (int i=0; i<numberOfQueries; i++){
            queries.add(scanner.nextInt());
        }

        System.out.println(weightedUniformStrings(input, queries).toString());
    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries){
        /*List<Integer> weights = new ArrayList<>();
        List<String> output = new ArrayList<>();

        int weight = 0;
        char previous = ' ';

        for (int i = 0; i < s.length(); i++) {

            char curr = s.charAt(i);
            if (curr != previous) {
                weight = 0;
            }
            weight += curr - 'a' + 1;
            weights.add(weight);
            previous = curr;

        }

        ListIterator<Integer> iterator = queries.listIterator();

        while (iterator.hasNext()){
            if (weights.contains(iterator.next())){
                output.add("YES");
            }
            else
                output.add("NO");
        }

        return output;*/


        HashSet<Integer> weights = new HashSet<>();
        int i=0,j=0;

        List<String> output = new ArrayList<>();

        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                weights.add(((int)s.charAt(i)-96)*(j-i+1));
                j++;
            }
            else
                i++;
        }

        for(i=0;i<queries.size();i++){
            if(weights.contains(queries.get(i)))
                output.add("Yes");
            else
                output.add("No");
        }

        return output;
    }
}
