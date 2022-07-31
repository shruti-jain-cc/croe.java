package corejava;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num =13;
      boolean flag = true;
      for(int index=2;index<num;index++)
      {
    	  int remainder = num%index;
    	  if (remainder==0)
    	  {
    		  System.out.println("Num is not prime number");
    		  flag = false;
    	  }
      }
      if (flag==true) {
    	  
    	  System.out.println("Num is prime");
      }
      
	}
	// prime number with array
	{
    int[] array1 = {20,30,40,55,13,11,17};
    boolean flag = true;
    for(int index=0;index<array1.length;index++) 

    for(index=2;index<array1.length;index++)
    {
  	  int remainder = array1.length%index;
  	  if (remainder==0)
  	  {
  		  System.out.println("Num is not prime number");
  		  flag = false;
  		  
  	  }
    }
    if (flag==true) {
  	  
  	  System.out.println("Num is prime");
    }
    
	}

}

