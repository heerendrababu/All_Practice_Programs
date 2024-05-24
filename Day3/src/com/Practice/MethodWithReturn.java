package com.Practice;


interface Movie
{
	public String bookTicket(String theatreName,String movieName);
}
public class MethodWithReturn
{

	public static void main(String[] args) 
	{
		// we must use curly braces if we have two statements
      Movie m=(theatreName,movieName)->{ System.out.println("Ticket is booked for "+movieName+" movie in "+theatreName);
      return("price: 200 Rs");
      };
      System.out.println(m.bookTicket("IMAX", "Salaar"));
	}

}
