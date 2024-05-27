package com.kmss;

import java.util.Objects;

public class EqualsAndHashcode {

	public static void main(String[] args) 
	{
       Student s1 = new Student(1,"Chowdaiah");
       Student s2 = new Student(1,"Chowdaiah");
       System.out.println(s1.equals(s2));

	}

}
class Student
{
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
