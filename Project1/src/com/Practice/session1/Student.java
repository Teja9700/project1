package com.Practice.session1;


public class Student {

		int age;
		String name;
		int rollno;
		
		public void display1() {
			System.out.println("Welcome to all");
		}
		public void display2() {
			System.out.println("automation is easy");
		}
		
		public static void main(String[] args) {
	         		Student s = new Student();
	         		s.age= 25;
	         	    s.name= "teja";
	         	    System.out.println("Your name is : " +s.name);
	         	    System.out.println("My age is : "+s.age);
	         	    s.display1();
	         	    s.display2();
	         	    

		}


}
