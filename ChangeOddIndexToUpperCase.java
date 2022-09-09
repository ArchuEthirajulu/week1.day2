package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = new String ("changeme");
		
		char[] charArray = test. toCharArray();
		for(int i= 0; i<test.length(); i++) {
			
		
		char ch = charArray[i];
		if( i%2!=0 ) {
			System.out.println(Character. toUpperCase(ch));
			
		}
		else
		{
			System.out.println(ch);
		}
			
		
		
		
		
		

	}
	}
	
}