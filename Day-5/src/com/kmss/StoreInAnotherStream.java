package com.kmss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StoreInAnotherStream {

	public static void main(String[] args)
	{
      List<Integer> li = Arrays.asList(1,6,4,8,9,10);
      
     List<Integer>  al = li.stream().filter(f->f%2==0).map(m->m*3).collect(Collectors.toList());
     System.out.println("Elements are added to al list: ");
     System.out.println(al);
	}

}