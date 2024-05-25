package com.kmss;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) 
	{
      Consumer<String> c = s->System.out.println(s);
      // method to invoke lambda expression is: 
      c.accept("Heerendra Babu");
	}

}
