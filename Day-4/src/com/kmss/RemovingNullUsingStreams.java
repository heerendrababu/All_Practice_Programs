package com.kmss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingNullUsingStreams 
{
	public static void main(String[] args) 
	{
	
    	List<String> words = Arrays.asList("Nani", null, "Arjun", "Viraj", "Krishna", null, "Gowtham");
				
		List<String> result = words.stream().filter(w -> w!=null).collect(Collectors.toList());
				
		System.out.println(result);
	  }
		
 }


