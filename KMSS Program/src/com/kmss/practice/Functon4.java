package com.kmss.practice;

// write a function to take student object and print it.
public class Functon4
{
	public static void main(String[] args)
	{
		// call studentData constructor and insert data to local variables
	   StudentData s = new StudentData("Babu", "MCA", 2023);
	   StudentData s1 = new StudentData("Naveen","MCA",2022);
	   s.display();
	   System.out.println();
		s1.display();
		      
	  }
	}
class StudentData
{
	String name;
	String dept;
	int year;
			
	public StudentData(String name,String dept,int year)
	{
	 // Assigning local variable to instance variable.
	this.name = name;
	this.dept = dept;
	this.year = year;
				
	 }
	// when it is called it will print data
	public void display()
	{
		System.out.println("Name of Student: "+name);
		System.out.println("department of Student: "+dept);
		System.out.println("year of passing is: "+year);
	 }
		
 }


