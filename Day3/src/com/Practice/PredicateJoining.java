package com.Practice;

import java.util.function.Predicate;

public class PredicateJoining 
{

	public static void main(String[] args) 
	{
      int[] arr= {5,15,20,25,30,35,40,45,50,55,60,65};
      
      Predicate<Integer> p1 = i-> i%2==0;
      Predicate<Integer> p2 = i-> i>50;
      
      // and -> Both conditions need to be true then returns true
      System.out.println("Following are even numbers and greater than 50");
      
      for(int n: arr)
      {
    	  if(p1.and(p2).test(n))
    	  {
    		  System.out.println(n);
    	  }
      }
      // or -> If atleast one condition is true it will return true.
      for(int n: arr)
      {
    	  if(p1.or(p2).test(n))
    	  {
    		  System.out.print(n+",");
    	  }
      }
      // negate -> Give opposite values of condition
      for(int n: arr)
      {
    	  if(p1.negate().test(n))
    	  {
    		  System.out.print(n+",");
    	  }
      }
      
	}

}
