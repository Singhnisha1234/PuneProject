package com.ns.java;
public class Singleton{

private static Singleton instance = null;

Singleton(){
}

public static Singleton getInstance(){

if(instance == null){
	synchronized(Singleton.class){
		if(instance== null){
		instance = new Singleton();
		return instance;
           //instance = new Singleton();
}
		}

}
return instance;
}
}

