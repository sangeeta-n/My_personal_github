package com.oops.inheritence.accessmodifier;

// will check the access modifiers position in other class

public class ChildClass extends SuperClass
{
	public static void main(String[] args)
	{
		SuperClass p = new SuperClass();
		// p.method1();    private class is not accessble
		p.method2();
		p.method3();
		p.method4();
		System.out.println("***child class modifier***");
		
		ChildClass c=new ChildClass();
		c.method2();
		c.method3();
		c.method4();
		
		
	}

}
