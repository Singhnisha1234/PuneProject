package com.ns.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Function {
	
	public static void main(String[] args) {
		
	

	List<String> list = Arrays.asList("kumar","arjun","kumar","red","yellow");
	
	HashSet<String> set = new HashSet<>();
	
	
	list.stream().filter(n -> !set.add(n)).collect(Collectors.toList()).forEach(System.out::println);
	//System.out.println(l);
	
	

}}
