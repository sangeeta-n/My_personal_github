package com.aspire.testingoops;
/* when we have same variable in parent and child class 
 * this and super keyword 
 
 */
public class SuperThisUse extends ParentClass
{
	
	int cash = 10000000;
	String car= "tesla";
	public void bachcha()
	{
		int totalCash= super.cash+ this.cash;
		System.out.println(totalCash);
		System.out.println(super.property);
		System.out.println(car);
		
	}
	public static void main(String[] args)
	{
		SuperThisUse b = new SuperThisUse();
		b.bachcha();
		

	}

}
