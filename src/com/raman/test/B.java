package com.raman.test;

public class B extends A{
	void show(){
		System.out.println("Hello B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*B b=(B) new A();*/
		A a=new B();
		/*b.show();*/
		a.show();

	}

}
