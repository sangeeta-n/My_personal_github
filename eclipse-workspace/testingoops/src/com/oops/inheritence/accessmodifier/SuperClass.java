package com.oops.inheritence.accessmodifier;

// program for access modifier public private protected and default.... 

public class SuperClass 
{
	private void method1()
	{
		System.out.println("private modifier");
	}
	protected void  method2()
	{
		System.out.println("protected modifier");
	}
	void method3()
	{
		System.out.println("default modifier");
	}
	public void method4()
	{
		System.out.println("public modifier");
	}
	

    	public static void main(String[] args)
    	{
    		SuperClass p = new SuperClass();
    		p.method1();
    		p.method2();
    		p.method3();
    		p.method4();
    		
		}
}
