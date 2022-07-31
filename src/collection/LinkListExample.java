package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList<String> List1 = new LinkedList<String>();
 List1.add("Reena");
	List1.add("Manoj");
	List1.add("shruti");
	List1.add("Rounak");
	
	System.out.println("The list is" + List1);
	System.out.println("The size of array" + List1.size());
	
	List1.remove(2);
	System.out.println("The list is" + List1);
	System.out.println("The size of array" + List1.size());
	System.out.println("Data at 2nd psoition " + List1.get(1));
	
	List1.set(2, "Vinay");
	System.out.println("The list is" + List1);
	
	List1.add(1, "Seema");
	System.out.println("The list is aftere adding seema " + List1);
	
	Collections.sort(List1);
	System.out.println("The sorted list is " + List1);
	
	Collections.reverse(List1); 
	System.out.println("The ascnding list is " + List1);
	
 for(int index=0;index<List1.size();index++)
 {
 	System.out.println("List is " + List1.get(index));
 }

 	
 for(int index=0;index<List1.size();index++)
 {
 		if(List1.get(index).equals("Reena"))
 		{
 		System.out.println(index);
 		break; 
 		}
 		
 	}
	}

}
