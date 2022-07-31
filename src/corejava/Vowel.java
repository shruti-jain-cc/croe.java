package corejava;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= ("India is the best country");
for (int index=0;index<str.length();index++)
{
	char ch = str.charAt(index);
	System.out.println(ch);
}

//TODO Auto-generated method stub
	String str1= ("India is the best country");
	int count = 0;

for (int index=0;index<str.length();index++)
{
	char ch = str1.charAt(index);
    if (ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u')
    {
    	count++;
    	
    }
   
}
System.out.println("the count is " + count);
	}
}


	

