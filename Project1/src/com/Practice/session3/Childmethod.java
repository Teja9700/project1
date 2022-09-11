package com.Practice.session3;

public class Childmethod extends Parentmethod {

	public void cm() {
		this.cm2(10,10);
		System.out.println("default child method");
	}
	public void cm1(int a) {
		this.cm3(10,10,10);
		System.out.println("1P child method");
	}
	public void cm2(int a, int b) {
		super.name = "teja";
		super.pm();
		super.pm3(10, 10, 10);
		super.pm1(10);
		super.pm2(10, 10);
		
        System.out.println("my name is " + name);
		System.out.println("2P child method");
	}
	public void cm3(int a, int b, int c) {
		this.cm();
		System.out.println("3P child method");
	}
	
	
	public static void main(String[] args) {
		Childmethod c = new Childmethod();
		c.cm1(10);

	}

}
