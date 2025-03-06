package com.ns.exception;

public class Shaadi {

	public static void main(String[] args) {
		
		int age = 61;
		
		if(age < 18) {
         throw new TooYoungException("please wait more some time");
		}else if(age > 60) {
			throw new TooOldException("your all is already crossed no chanse for getting marriage");
		}else {
			System.out.println("you will get match details by mail sortly.....");
		}
	}
}
