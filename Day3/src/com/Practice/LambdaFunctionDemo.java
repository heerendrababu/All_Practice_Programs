package com.Practice;

import java.util.function.Function;

public class LambdaFunctionDemo {

	public static void main(String[] args)
	{
      Function<Integer, Integer> f = (x)->(x*x);
      int i = f.apply(5);
      System.out.println(i);
	}

}
