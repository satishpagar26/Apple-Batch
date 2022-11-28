package testingprograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Satish Kailas Pagar";
		String output = "";

		for (int i =( input.length()-1);i>=0; i--)
		{
			char x = input.charAt(i);
			output = output + x;
		}
		System.out.println(output);
	}
}
