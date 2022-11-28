package whileloop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit:  ");
		limit = sc.nextInt();

		while (limit>i)
			
		{
			System.out.println(limit);
			limit--;
		}
		System.out.println("Done");
		sc.close();
	}

}
