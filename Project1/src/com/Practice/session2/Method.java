package com.Practice.session2;

public class Method {

	public void m1() {
	
		System.out.println("default method");
	}
	
	public void m2(int a) {
		this.m4(10, 2, 3);
		this.m1();
		this.m3(15, 12);
		this.m5(2, 4, 6, 8);
		System.out.println("first method");
	}
	
	public void m3(int a, int b) {
		
		System.out.println("second method");
	}
	
	public void m4(int a, int b, int c) {
		
		System.out.println("third method");
	}
	
	public void m5(int a, int b, int c, int d) {
		
		System.out.println("fourth method");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Method m =  new Method();
	m.m2(10);
	}

}