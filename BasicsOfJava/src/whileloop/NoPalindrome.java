package whileloop;

import java.util.Scanner;

public class NoPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a palindrome no");
		a = sc.nextInt();
//b=sc.nextInt();
	while (a> 0) {
			a = a % 10;
			a = a / 10;
			b = b * 10 + a;
		}
		System.out.println("Palindrome no:"+b);

	}

}
