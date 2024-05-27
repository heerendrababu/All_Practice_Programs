package com.kmss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStreamEx {

	public static void main(String[] args)
	{
       	List<Integer> ln = Arrays.asList(1, 2, 3, 4, 6,-1,-2);
       	IntStream.range(0, ln.size()).filter(f->ln.get(f)%2==0).forEach((x)->
       	{
       		int i = ln.get(x);
       		System.out.println(i);
       	
	     });
	}
}


