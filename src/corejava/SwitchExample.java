package corejava;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= ("India is the best country");
		str= str.toLowerCase();
		int count  = 0;
		int  a  = 0;
		int e  = 0;
		int  i = 0;
		int  o  = 0;
		int u  = 0;
		for (int index=0;index<str.length();index++)
		{
			
			char ch = str.charAt(index);
			switch(ch) {
			
			case 'a':
				a++;
			case 'e':
				e++;
			case 'i':
			i++;
			case 'o':
				o++;
			case 'u':
				u++;
				count++;
				break;
		}
			
		}
		System.out.println("the count is " + count);
	}

}
