package com.Practice.session3;

public class Parent1 {

	public Parent1() {
		this(10);
		System.out.println("default parent constructor");
	}
	public Parent1(int a) {
		this(10,10,10);
		System.out.println("1P parent constructor");
	}
	public Parent1(int a, int b) {
		this();
		System.out.println("2P parent constructor");
	}
	public Parent1(int a, int b, int c) {
		
		System.out.println("3P parent constructor");
	}
	
}
