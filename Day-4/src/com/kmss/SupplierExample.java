package com.kmss;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) 
	{
		//Supplier<Return Type> which doesn't take any arguments.
      Supplier<Integer> s = ()->10*10;
      // when s.get() called Supplier  will return 100
     System.out.println(s.get());
      
	}

}
