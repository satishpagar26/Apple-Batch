import java.util.Scanner;

public class VariationProgramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a,b;
 Scanner sc = new Scanner(System.in);
 System.out.println("1.Additiom\n 2.Substraction\n 3.Division\4.Multiplication");
 System.out.println("Enter your choice");
 int ch= sc.nextInt();
 
 switch(ch)
 {
 case 1:
	 System.out.println("Addition of two no");
	 a=sc.nextInt();
	 b=sc.nextInt();
	 System.out.println("Addition is :  "+(a+b));
	 break;
	 
 case 2:
	 System.out.println("Substraction of two no");
	 a=sc.nextInt();
	 b=sc.nextInt();
	 System.out.println("Substraction is :  "+(a-b));
	 break;
	 
 case 3:
	 System.out.println("MUltiplication of two no");
	 a=sc.nextInt();
	 b=sc.nextInt();
	 System.out.println("MUltiplication is :  "+(a*b));
	 break;
	 
 case 4: 
	 System.out.println("Division of two no");
	 a=sc.nextInt();
	 b=sc.nextInt();
	 System.out.println("Division is :  "+(a/b));
	 break;
 }
 sc.close();
	}

}
