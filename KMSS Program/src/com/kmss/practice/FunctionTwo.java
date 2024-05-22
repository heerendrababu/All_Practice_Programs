package com.kmss.practice;

// write a function with arguments.
public class FunctionTwo {

	public static void main(String[] args) 
	{
      Two t = new Two();
      t.m(1);
	}

}
class Two
{
	public void m(int i)
	{
		System.out.println("function m() with int data as argument");
	}
}
