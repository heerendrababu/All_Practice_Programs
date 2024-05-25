package com.kmss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsStringExample {

	public static void main(String[] args)
	{
     List<String> names = Arrays.asList("Heerendra","Jagadeesh","Raju","Choudayya");
     List<String> longnames = new ArrayList<String>();
     
   //  names.stream().filter(str->str.length()>5 && str.length()<10).forEach(System.out::println);
     
     // or
     names.stream().filter(str->str.length()>5 && str.length()<10).forEach(str->System.out.println(str));
	}

}
