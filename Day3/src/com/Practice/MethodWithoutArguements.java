package com.Practice;

@FunctionalInterface
interface Cab
{
  public void bookCab();
 
}

public class MethodWithoutArguements 
{

	public static void main(String[] args)
	{
       Cab c = ()->System.out.println("Cab is booked...");
       c.bookCab();
	}

}
