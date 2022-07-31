package corejava;

public class Loopingexample1{

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	int num =2;
	
	while(num<=10) {
		
		if(num==6) {
			
			num = num+2;
			continue;
		}
			
		System.out.println(num);	
		num = num+2;
		
	}
	
	
	System.out.println("After While Loop");
	

	// for loop
	
	for(int index=1;index<=10;index++) 
	{
		if (index==6)
		{
			continue;
		}
		System.out.println(index);
	}
}
	
	


}





