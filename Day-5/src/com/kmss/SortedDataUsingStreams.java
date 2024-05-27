package com.kmss;

import java.util.Arrays;
import java.util.List;

public class SortedDataUsingStreams {

	public static void main(String[] args)
	{
	       List<Integer> li = Arrays.asList(8,2,4,3,9,6,7,2);
	  // in stream() .filter(f->considered as value in list) and check it it even or not in list and sort the data in ascending order
	       li.stream().filter(f->f%2==0).sorted().forEach(System.out::println);
	      

	}

}
