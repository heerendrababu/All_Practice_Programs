package com.kmss;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	int sid;
	String sname;
	int marks;
	
	Student(int sid,String sname,int marks)
	{
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
}
public class StudentListUsingFunctionalInterfaces
{

	public static void main(String[] args) 
	{
      ArrayList<Student> stlist = new ArrayList<Student>();
      stlist.add(new Student(1,"Babu",583));
      stlist.add(new Student(2,"Raju",412));
      stlist.add(new Student(3,"Narasimha",400));
      stlist.add(new Student(4,"Jagadeesh",450));
      
      // 1) Function 
      // calculate cgpa and return float value.
      Function<Student, Float> f = stu->(float)((stu.marks)/6)/10;
      
      // 2) check student who got more than 9.5 cgpa
      Predicate<Float> p = c-> c>=8.5;
      
      // 3) Consumer to print data
      Consumer<Student> con = stu->
      {
    	 System.out.println(stu.sid);
    	 System.out.println(stu.sname);
    	 System.out.println(stu.marks);
      };
      
    for(Student s : stlist)
    {
    	// call to calculate cgpa
    	float cgpa = f.apply(s);
    	// call to get data more than 9.5
    //	System.out.println("student who got more than 9.5 is : ");
     if(p.test(cgpa))
     {
    	 con.accept(s);
    	 System.out.println(cgpa);
     }
    	
    }
      
      
	}

}
