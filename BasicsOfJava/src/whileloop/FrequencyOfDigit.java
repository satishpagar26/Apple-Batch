package whileloop;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, d, frequency = 0;
		System.out.println("Enter a number");
		num = sc.nextInt();
		System.out.println("Enter a digit to check frequency");
		d = sc.nextInt();

		for (int i = 1; num != 0; i++) {
			if (num % 10 == d) {
				frequency++;
			}
			num = num % 10;
		}
		System.out.println("Frequency of digit " + frequency);
		sc.close();
	}

}
