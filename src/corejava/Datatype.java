package corejava;

public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 = 100;
int num2= 200;
int sum = num1+ num2;
float div = (float) num1/num2;

System.out.println("The sum of two number is " + sum );
System.out.println("The sum of two number is " + div );

String str1 = ("India Is best");
System.out.println(str1);
System.out.println("The length of the string is " + str1.length());


char chr1 = str1.charAt(0);
System.out.println(chr1); 
char chr2 = str1.charAt(str1.length() - 1);
System.out.println(chr2); 

System.out.println("the String in the lower case " + str1.toLowerCase());
System.out.println("the String in the upper case " + str1.toUpperCase());



//int i 
//for (i,i=0,i++);
	}

}
