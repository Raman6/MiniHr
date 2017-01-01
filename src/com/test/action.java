package com.test;

public class action {
	public static void main(String[] args) {
		maint();
		
	}

	static A maint(){
		
		//A ab=new A();
		Dao da=new Dao();
		A aa=da.test();
		B b=aa.getB();		
		System.out.println("Hello:"+b.getAddress());
		return aa;
	}

}
