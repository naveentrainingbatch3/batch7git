package main;

import creational.SingletonClass;

public class TestMain {

	public static void main(String[] args) {
		
		SingletonClass singletonClass=SingletonClass.getInstance();
		System.out.println(singletonClass.hashCode());
		SingletonClass anothersingletonClass=SingletonClass.getInstance();
		System.out.println(anothersingletonClass.hashCode());
		
		
	}
}
