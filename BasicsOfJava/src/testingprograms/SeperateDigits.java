package testingprograms;

public class SeperateDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// your authorisation number is 786560
		String input="your authorisation number is 786560";
		String output= " ";
				
		for(int i=0;i<input.length();i++)
		{
			char x = input.charAt(i) ;
		
		if(Character.isDigit((char) x))
		output=output +x;
	}	
		System.out.println(output);
	}
}
