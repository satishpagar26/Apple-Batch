package whileloop;

import java.util.Scanner;

public class FindPerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int l,b,perimeter;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length:");
l=sc.nextInt();
System.out.println("Enter the breadth");
b=sc.nextInt();

perimeter=2*(l*b);
System.out.println("Perimeter of rectangle is: "+perimeter);
sc.close();


	}

}
