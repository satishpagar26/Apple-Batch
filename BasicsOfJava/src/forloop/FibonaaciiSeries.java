package forloop;

import java.util.Scanner;

public class FibonaaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, a = 0, b = 1, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(" "+a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
