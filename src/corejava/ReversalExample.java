package corejava;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= ("India is the best country");
		String result = ("");
	
		for(int index=str.length()-1;index>=0;index--)
		{
			char ch = str.charAt(index);
			result = result+ ch;
	}
		System.out.println("The result string is " + result);
	
	
	int num = 456789;
    int result2=0;
    while (num>0)
    {
    int rem = num%10;//9
    result2= result2*10 + rem;
    num = num/10;//45978
    }
    System.out.println("the result is  "+ result2);
}
}
