package com.kmss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsIntegerExample {

	public static void main(String[] args) 
	{
      List<Integer> numList = Arrays.asList(12,15,18,21,22);
      List<Integer> evenNumList = new ArrayList<Integer>();
      
      // Using Streams we are storing collection data to streams and perform filter() and later that storing it in another collection-
      // named as "evenNumList"
      // filter()uses Predicate to check even or not
      // collect() used to add from "numList collection" to "evenNumList collection"
      evenNumList = numList.stream().filter(n->n%2==0).collect(Collectors.toList());
      System.out.println("Storing into another collection: ");
      System.out.println(evenNumList);
      
      // without storing into another collection just get the result without returning, then we use consumer() method
      System.out.println("without storing into another collection: ");
      numList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
      
	}

}
