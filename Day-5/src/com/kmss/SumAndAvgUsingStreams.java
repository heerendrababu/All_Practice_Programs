package com.kmss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumAndAvgUsingStreams {

	public static void main(String[] args) 
	{
       List<Integer> num = Arrays.asList(1,2,3,4,5);
        int sum = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: "+sum);
        
       double avg = num.stream().mapToInt(Integer:: intValue).average().orElse(0);
       System.out.println("Average : "+avg);
     
                
	}

}
