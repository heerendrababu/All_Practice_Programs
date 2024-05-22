package com.kmss.practice;

// Find second largest element in array
public class SecondLargestElement
{

	public static void main(String[] args)
	{
      int[] arr = {12,9,37,22,44,33};
      int bignum = arr[0];
      int secbig = arr[0];
      
      for(int i=0;i<=arr.length-1;i++)
      {
    	  if(arr[i]>bignum)
    	  {
    		  bignum = arr[i];
    	  }
      }  
      System.out.println("largest element: "+bignum); 
      
      for(int i=0;i<=arr.length-1;i++)
      {
    	  if(arr[i]>secbig && arr[i]<bignum)
    	  {
    		  secbig = arr[i];
    	  }
      }
      System.out.println("second laregest element: "+secbig);
	}

}
