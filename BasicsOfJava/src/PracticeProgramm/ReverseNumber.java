package PracticeProgramm;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		i = sc.nextInt();
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		System.out.println("Done");
		sc.close();
	}

}
