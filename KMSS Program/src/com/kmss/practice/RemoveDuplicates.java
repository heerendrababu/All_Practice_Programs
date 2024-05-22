package com.kmss.practice;

// Write a program to remove duplicates from array
public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
      int[] arr= {1, 2, 3, 4, 4};
      
      // Array to store unique elements
      int temp[] = new int[arr.length];
      int j=0;
      
      for(int i=0;i<arr.length-1;i++)
      {
          // check if current element is not equal to next element
    	  if(arr[i]!=arr[i+1])
    	  {
          // if not equal, it's a unique element and add it to temp array.
    		  temp[j++]= arr[i];
    	  }
      }
      
      // Add the last element of the input array to temp array
      temp[j] = arr[arr.length-1];
      
      // Print the result array without duplicates
      for(int i = 0; i <= j; i++) {
          System.out.print(temp[i] + " ");
      }
	}

}
