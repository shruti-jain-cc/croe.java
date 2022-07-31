package corejava;

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array1 = {20,30,40,50,60,70,80}; 
System.out.println("The lenghth of the arraye is " + array1.length);
System.out.println("The second num is " + array1[2]);
System.out.println("The lenghth of the arraye is " + array1[array1.length - 1]);


String str1 = ("India Is best");
String[] array2 = str1.split(" ");
System.out.println("The lenghth of the arraye is " + str1.length());
System.out.println("The lenghth of the arraye is " + array2[2]);
System.out.println("The lenghth of the arraye is " + array2.length);

char[] array3 = array2[2].toCharArray();
System.out.println("total character in string 3 is " + array3.length);


 	}

}
