package com.Practice.session3;

public class Child1 extends Parent1 {

	public Child1() {
		this(10,10,10);
		System.out.println("default child constructor");
	}
	public Child1(int a) {
		super(10,10);
		System.out.println("1P child constructor");
	}
	public Child1(int a, int b) {
		this();
		System.out.println("2P child constructor");
	}
	public Child1(int a, int b, int c) {
		this(10);
		System.out.println("3P child constructor");
	}
	
	
	public static void main(String[] args) {
		Child1 c = new Child1(10,10);
		

	}

}
