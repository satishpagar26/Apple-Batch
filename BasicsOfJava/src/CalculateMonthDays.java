import java.util.Scanner;

public class CalculateMonthDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num,year;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a month");
 num=sc.nextInt();
 System.out.println("Enter the year");
 year=sc.nextInt();
 
	switch (num) {
	case '1':
	case '3':
	case '5':
	case '7':
	case '9':
		System.out.println("No of Days is 31");
		break;
	case '2':
		if (year % 4 == 0)
		System.out.println("this is a leaf year");
		else
			System.out.println("given year is not a leaf year");			
		break;
	case '4':
	case '6':
	case '8':
		System.out.println("No of Days is 30");
		break;

	}
	sc.close();
}
}