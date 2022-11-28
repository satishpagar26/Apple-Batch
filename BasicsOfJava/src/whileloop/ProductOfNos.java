package whileloop;

import java.util.Scanner;

public class ProductOfNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num = 0,rem,product=1;
		System.out.println("Enter the number");
		num=sc.nextInt();
while(num!=0)
{
	rem=num%10;
	product=product*rem;
	num=num/10;
}
System.out.println("product of digit is " + product);
	}

}
