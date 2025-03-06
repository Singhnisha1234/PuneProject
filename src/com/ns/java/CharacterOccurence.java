package com.ns.java;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {
	public static void main(String[] args) {
		
	
	
	String str = "nishasingh";
	
	char[] ch = str.toCharArray();
	
	Map<Character,Integer> map = new HashMap<>();
	
	for (int i = str.length() - 1; i >= 0; i--){
		 if(map.containsKey(ch[i]) ) {
			 map.put(ch[i], map.get(ch[i]) + 1);
				 
			 
		 }else {
			 map.put(ch[i] , 1);
		 }
		
	}
	System.out.println(map);
	}
}
