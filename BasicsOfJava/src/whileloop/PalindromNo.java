package whileloop;

public class PalindromNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 243;
		int output =0;
		while (a > 0) {
			int reminder = a % 10;
			a = a / 10;
			output = output * 10 + reminder;
		}
		System.out.println("Palindrome no:"+output );
	}
}
