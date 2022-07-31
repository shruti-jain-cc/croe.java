package oops;

public class Employee{//defined the class 
 
	public String Name; //properties in a class
	public int EmpId;//properties in a class
	public String Department;//properties in a class
	
	public Employee()//Constructors
	{
	 System.out.println("default const.");
	}
	
	public Employee(String P1, int P2, String P3)
	{
		Name = P1;
		EmpId = P2;
		Department = P3;
	}
public  void Display()//this is the function
{
	System.out.println(Name);
	System.out.println(EmpId);
	System.out.println(Department);
	
}
	
}
