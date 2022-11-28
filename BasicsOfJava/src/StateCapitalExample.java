import java.util.Scanner;

public class StateCapitalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the state name");
		sname = sc.nextLine();

		sname = sname.toLowerCase();

		switch (sname) {

		case "maharashtra":
			System.out.println("Capital is Mumbai");
			break;
		case "goa":
			System.out.println("Capital is panjim");
			break;
		case "bihar":
			System.out.println("Capital is kanpur");
			break;
		case "madhya pradesh":
			System.out.println("Capital id Bhopal");
			break;
		case "Uttar pradesh":
			System.out.println("Capital is lukhnow");
			break;
		case "jammu kashmir":
			System.out.println("Capital is Gandhinagar");
		
		default:{
		
			System.out.println("Enter a valid state");
		}
		sc.close();
	}
	}
}