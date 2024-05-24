package com.Practice;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaFunctionDemo2 {

	public static void main(String[] args) 
	{
      BiFunction<Integer,Integer,Integer> fun = (x,y)->(x/y);
      int i = fun.apply(6,2);
      System.out.println(i);
      
      
	}
}
