package com.kmss.practice;

// write a programs on recursive functions.
public class RecursiveFunction
{
	public static void main(String[] args)
	{
		  // Num for which factorial is calculated
		  int num = 5; 
		   // Calls the factorial function
		  int result = factorial(num); 
		 System.out.println("Factorial of " + num + " is: " + result);
	 }
	
    // Factorial function
    public static int factorial(int n)
    {
        if (n == 0)
        {
        // Base case
            return 1;
        } 
        else 
        {
        	// Recursive case
            return n * factorial(n - 1);
         }
       }
    }

    
