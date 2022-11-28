package whileloop;

import java.util.Scanner;

public class ConvertDaysIntoYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d, y, w;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the days:  ");
		d = sc.nextInt();

		y = (d / 365);
		System.out.println("years :  " + y);
		w = (365 / 7);
		System.out.println("Weeks :" + w);
		d = (y * 365) ;
		System.out.println("Days:" + d);
		sc.close();
	}
}
