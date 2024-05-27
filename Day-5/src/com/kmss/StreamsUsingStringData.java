package com.kmss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsUsingStringData {

	public static void main(String[] args)
	{
		 List<String> li = Arrays.asList("babu","jagadeesh","hi","hi");
		 li.stream().filter(f->f.length()>1).distinct().forEach(System.out::println);
		 
	    }
	}


