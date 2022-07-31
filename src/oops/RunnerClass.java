package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee E1 = new Employee(); //Create the object E1 in the class
E1.Name = "Mike";// Giving the attributes to the properties in the class
E1.EmpId = 1000;// Giving the attributes to the properties in the class
E1.Department = "HR";// Giving the attributes to the properties in the class
System.out.println(E1.Name);
System.out.println(E1.EmpId);
System.out.println(E1.Department);


Employee E2 = new Employee();
E2.Name = "Sanjay";// Giving the attributes to the properties in the class
E2.EmpId = 1002;// Giving the attributes to the properties in the class
E2.Department = "It";
E2.Display();

Employee E3 = new Employee("Jack",1002,"Finance");
E3.Display();

	}

}
