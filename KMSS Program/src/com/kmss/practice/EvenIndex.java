package com.kmss.practice;

// Print elements at even index in array
public class EvenIndex 
{

	public static void main(String[] args)
	{
      int[] arr = {10,22,33,44,55,66};
      for(int i=0;i<=arr.length-1;i++)
      {
    	 // condition for checking even index and i value > 0
    	  if(i%2==0 && i>0)
    	  {
        	  System.out.println(arr[i]); 
    	  }
      }
	}

}
