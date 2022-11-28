package whileloop;

import java.util.Scanner;

public class OddNo521To229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =229, limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		limit = sc.nextInt();

		while (limit >=i)
		{
			System.out.println(limit);
			limit =limit-2;
		}
		System.out.println("Done");
		
		sc.close();
	}
}
