package com.kmss;

public class GetPossibilitySetsCount 
{

	public static void main(String[] args) 
	{
		int[] arr = {0,1,2,3,4,5,6,7};
	       int count =0;
	       int target =5;
	       for(int i=0;i<=arr.length-1;i++)
	       {
	    	    
	    	   for(int j=i+1;j<=arr.length-1;j++)
	    	   {
	    		     if(arr[i]+arr[j]==target && arr[i]!=0)
	    		   {
	    			   count++;
	    		   }  
	    	   }
	       } 
	 	  System.out.println("no of possibilites: "+count); 
	}

}
