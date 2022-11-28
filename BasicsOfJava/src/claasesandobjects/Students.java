package claasesandobjects;

import java.util.Scanner;

public class Students {

	int id,marks;
	String name, dept;
	
	void setData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id");
		id=sc.nextInt();
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter the dept");
		dept=sc.next();
		System.out.println("Enter the marks");
		marks=sc.nextInt();
	}
	
	void display()
	{
	System.out.println(id+" "+name+" "+dept+" "+marks+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s1=new Students();
		s1.setData();
		Students s2=new Students();
		s2.setData();
		Students s3=new Students();
     	s3.setData();
     	
     	s1.display();
     	s2.display();
     	s3.display();
		
	}

}
