package com.ns.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Anagram {

	public static void main(String[] args) {

		String s1 = "Heart";          //aehrt
		String s2 = "Earth";          //aehrt

		s1 = Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        
       if( s1.equals(s2)) {
    	   System.out.println("Anagram");
       }else {
    	   System.out.println("not anagram");
       }
        
	}

}
