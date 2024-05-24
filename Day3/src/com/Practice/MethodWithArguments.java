package com.Practice;


interface Cab1
{
	public void m1(String source,String destination);
}

public class MethodWithArguments 
{
	public static void main(String[] args)
	{
      Cab1 c = (source,destination)->System.out.println("ola cab is booked from "+source+" To "+destination);
      c.m1("Bangalore", "Hyderabad");
	}

}
