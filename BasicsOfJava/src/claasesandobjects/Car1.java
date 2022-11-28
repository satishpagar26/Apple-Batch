package claasesandobjects;

import java.util.Scanner;

public class Car1 {
	
	int price,speed;
	String name,color,mop;
	
	void setData(String n, int p,String c,int s,String mop1)
	{
		name=n;
		price=p;
		color=c;
		speed=s;
		mop=mop1;
		
	}
	void discount()
	{
		float discount;
		System.out.println("mode of payment:  "+mop);
		if(mop.equalsIgnoreCase("online"))
		{   
			discount=price*0.05f;
			System.out.println("Discount is; "+discount);
			System.out.println("new price: "+(price-discount));
		}
	}

	void display()
	{
		System.out.println(name+" "+ price+" "+ color);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name,price,color,speed,mode of payment(online/cash)");
		String n=sc.next();
		int p=sc.nextInt();
		String c=sc.next();
		int s=sc.nextInt();
		String m=sc.next();
		
		Car c1=new Car();
		
		c1.setData(n, p, c, s,m);
		c1.display();
		c1.discount();
		
	}

}
