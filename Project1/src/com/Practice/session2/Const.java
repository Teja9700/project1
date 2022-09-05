package com.Practice.session2;

	public class Const {
		public Const() {
			this(10,1,1);
			System.out.println(" default constructor");
		}

		public Const(int a){
			this();
			System.out.println("it's a one parameterised constructor");
		}

		public Const(int i, int k) {
			this(1);
			System.out.println("it's a two parameterised constructor");
		}

		public Const(int t, int y, int u) {
			System.out.println("it's a three parameterised constructor");
		}

		public Const(int a, int b, int c,int d ) {
			this(1,1);
			System.out.println("it's a four parameterised constructor");
		}

		public static void main(String[] args) {
			Const c = new Const(1,1,1,1);


		}

}
