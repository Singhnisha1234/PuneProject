package com.ns.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 3, 40, 5);
        
        // Using a custom comparator to find the maximum number
        int maxNumber = numbers.stream().max(Comparator.naturalOrder()).get();
        
        // Print the result
       // maxNumber.ifPresent(System.out::println);  // Output: 40
        System.out.println(maxNumber);
    }
}
