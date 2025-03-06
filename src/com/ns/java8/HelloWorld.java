package com.ns.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class HelloWorld {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,3,4,6,7,8);
        
       int l =  list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(l);
    }}
