package com.Practice.session1;


public class Airthmetic {
	public int sum(int a, int b) {
		int c=a+b;
	System.out.println("the sum result is" + c);
		return c;
	
	}
	
	public int sub(int x, int y) {
		int z=x-y;
		System.out.println("the sub result is" + z);
		return z;
	}
	public int multi(int a1, int b1) {
		int c1=a1*b1;
		System.out.println("the Multi result is" + c1);
		return c1;
	}
	public int div(int x1, int y1) {
		int z1=x1/y1;
		System.out.println("the div result is" + z1);
		return z1;
	}
	
	public static void main(String[] args) {
		
		Airthmetic A = new Airthmetic();
		int sumresult = A.sum(10, 2);
		int sumresult1 = A.sum(sumresult, 2);
		int mulresult = A.multi(sumresult1, 2);
		int subresult = A.sub(mulresult, 2);
		int divresult = A.div(subresult, 2);
		System.out.println("Final result is (((((10+2)+2)*2)-2)/2): " + divresult);
		
		
	
		int mresult = A.multi(10, 2);
		int sresult1 = A.sub(mresult, 2);
		int s1result = A.sum(sresult1, 2);
		int s2result = A.sub(s1result, 2);
		int dresult = A.div(subresult, 2);
		System.out.println("Final result is (((((10*2)-2)+2)-2)/2)" + dresult
				);
		
		
		
		
		
		
	}
	
	

}
