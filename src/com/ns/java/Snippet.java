package com.ns.java;

public class Snippet {
	
	public static void main(String[] args) {
		
	int[] arr = {1,4,9,3,4,5};
			
			int fm = arr[0];            //9
			int sm = arr[1];
			
			for(int i=2;i<arr.length;i++) { 
				if(arr[i]>fm) {           //  5 > 9
					fm = arr[i];
				}
				else if(arr[i] < fm && arr[i]> sm) {      // 5 < 9 , 5 >4
					sm = arr[i];
				}
				}
			
			System.out.println(sm);
}}

