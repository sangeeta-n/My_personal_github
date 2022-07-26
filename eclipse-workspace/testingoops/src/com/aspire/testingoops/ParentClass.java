package com.aspire.testingoops;

/*parent class global variable is access with super keywords in child class and child class variable is access with this keyword*/


public class ParentClass 
{
	String property = "agricultureland";
	int cash = 70000000;
	
    public void papa()
    {
    	System.out.println("papaji ki properties = " + property  +   cash);
    	
    }
    public static void main(String[] args)
    {
    	ParentClass p = new ParentClass();
    	p.papa();
   
		
	}
    

}
