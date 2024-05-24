package com.Practice;

import java.util.function.Predicate;

public class PredicateExample 
{

	public static void main(String[] args)
	{
		
	  Predicate<Integer> isGreaterThanTen = num -> num > 10;
      Predicate<Integer> isEven = num -> num % 2 == 0;

	  Predicate<Integer> isGreaterThanTenAndEven = isGreaterThanTen.or(isEven);

	  System.out.println(isGreaterThanTenAndEven.test(8));   // Output: false
	  System.out.println(isGreaterThanTenAndEven.test(12));  // Output: true
     }
 }


