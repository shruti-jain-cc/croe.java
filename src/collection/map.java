package collection;

import java.util.HashMap;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1= new HashMap<Integer,String>();
		map1.put(1, "Katee");
		map1.put(2, "Leena");
		map1.put(3, "Kareie");
		map1.put(4, "Justin");
		map1.put(5, "Louis");
		
		System.out.println("The data is  "+ map1);
		
		map1.replace(4, "arpita");
		System.out.println("The data is  "+ map1);
		
		System.out.println("The data is 4th key "+ map1.get(4));
		
		for(Integer key: map1.keySet())
		{
			System.out.println("The key is  "+ key);
			System.out.println("The value is  "+ map1.get(key));
		}
	}

}
