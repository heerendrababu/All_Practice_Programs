package com.kmss;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employe
{
	String ename;
	int salary;
	
	Employe(String ename,int salary)
	{
		this.ename=ename;
		this.salary=salary;
	}
}
public class FunctionAndPredicateExample
{

	public static void main(String[] args) 
	{
		// it contains emplist object and type is "Employee"type
      ArrayList<Employe>emplist = new ArrayList<Employe>();
      emplist.add(new Employe("Babu",40000));
      emplist.add(new Employe("Raju",35000));
      emplist.add(new Employe("Kishore",30000));
      emplist.add(new Employe("Krishna",40000));

      // in Function if we have multiple statemets we need to use curly braces.
      // Lambda Expression:
      Function<Employe, Integer> fun= e->{
    	  int sal = e.salary;
    	  if(sal>=10000 && sal<=20000)
    	  {
    		  return (sal*10/100); // 10% of salary returning as a bonus
    	  }
    	  else if(sal>20000 && sal<=30000)
    	  {
    		  return (sal*20/100);
    	  }
    	  else if(sal>30000 && sal <=50000)
    	  {
    		  return (sal*30/100);
    	  }
    	  else
    		  return (sal*40/100);
      };
      Predicate<Integer> p = b-> b<10000; // it will check bonus which are < 5000
      
      for(Employe emp:emplist)
      {
    	  // To invoke lambda expression we use method of Function interface ie., "apply()"
    	  int bonus = fun.apply(emp);  // Function
    	if(p.test(bonus))
    	{// Predicated
    	  System.out.println(emp.ename+" "+emp.salary);
    	  System.out.println("bonus is: "+bonus);
    	  System.out.println();
    	}
      }
      
	}

}
