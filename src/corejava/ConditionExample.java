package corejava;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		if (age>20)
		{
			System.out.println("You are eligible for the voting");
		}
		else if (age == 20)
		{
			System.out.println("Better luck next time");
		}
		else
		{
			System.out.println("Not eligible for the voting");
		}
		
	// even number check	
		int num = 33;
		if (num%2==0)
		{
			System.out.println("number is even");
		}
		
		else
		{
			System.out.println("number is odd");
		}
		
	// even number check with array
		int[] array1 = {20,40,55,67,70,80}; 
		int i;
		for (i=0;i <= array1.length;i++) 
		{
		if (i%2==0)
		{
			System.out.println(i + "number is even");
		}
		}
		
		
	}
}	

	
