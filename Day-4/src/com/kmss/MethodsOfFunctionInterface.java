package com.kmss;

import java.util.function.Function;

public class MethodsOfFunctionInterface 
{

	public static void main(String[] args)
	{
      Function<Integer, Integer> f1 = i->i*2;
      Function<Integer, Integer> f2 = i->i*i*i;
      
      // 1st it will execute f1.apply() return result to f2 then f2.apply(result) will execute.
      System.out.println("andThen(): "+f1.andThen(f2).apply(2));
      
      // 1st it will execute f2.apply() return result to f1 then f1.apply(result) will execute.
      System.out.println("compose(): "+f1.compose(f2).apply(2));
      
	}

}
