package com.Practice;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int sal;
	int exp;
	
	Employee(String ename,int sal,int exp)
	{
		this.ename=ename;
		this.sal=sal;
		this.exp=exp;
	}
}
public class PredicateExampleTwo
{

	public static void main(String[] args) 
	{
       Employee emp= new Employee("Babu",30000,1);
       
       // emp obj --> return name if sal >30k exp>3
       Predicate<Employee> pr = e->(e.sal>30000 && e.exp>3);
       // System.out.println(pr.test(emp));
       
     ArrayList<Employee> al = new ArrayList<Employee>();
       al.add(new Employee("Giri",40000,5));
       al.add(new Employee("Raju",35000,3));
       al.add(new Employee("Choudayya",45000,2));
       al.add(new Employee("Prasad",30000,1));
       
       for(Employee e:al)
       {
    	   if(e.sal>30000 && e.exp>3)
    	   {
    		   System.out.println(e.ename+" "+e.sal);
    	   }
       }
    		   
	}

}
