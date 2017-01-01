package com.test;

public class Dao {
	public A test() {
		A a=new A();
		B b = new B();
		b.setAddress("cpl");
		C c = new C();
		c.setName("Banda");
		
		a.setB(b);
		a.setC(c);
		return a;
		
	}
}
