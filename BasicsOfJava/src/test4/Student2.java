package test4;

import java.util.Scanner;

public class Student2 {
float Calculate (int physics,int chemistry,int math)
{
	float percentage=(physics+chemistry+math)/3;
	return percentage;
}
	void display(float percentage)
	{
		if(percentage>75)
		{
			System.out.println("First class with disctinction");
		}
		else if(percentage<75 && percentage >60)
		{
			System.out.println("First class");
		}
		else if(percentage<60 && percentage >55)
		{
			System.out.println("Second class");
		}
		else if(percentage<55 && percentage >35)
		{
			System.out.println("Pass class");
	}
		else
		{
			System.out.println("Failed");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int p,c,m;
System.out.println("Enter the marks of physics,chemistry,math");
p=sc.nextInt();
c=sc.nextInt();
m=sc.nextInt();


Student2 s=new Student2();
float percentage=s.Calculate(p, c, m);
s.display(percentage);



	}

}
