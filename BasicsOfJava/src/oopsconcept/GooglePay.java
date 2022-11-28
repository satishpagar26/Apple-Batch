package oopsconcept;

import java.util.Scanner;

public class GooglePay {
	
	void withdraw(int amount,Account acc)
	{
		int accbal=acc.getbalance();
		if(accbal>amount)
		{
			accbal=accbal-amount;
			acc.setBalance(accbal);
		}
		else
		{
			System.out.println("Low balancet");
		}
		
	}
	void diposite(int amount,Account a1)
	{
		int accbal=a1.getbalance();
		{
		accbal=accbal+amount;
		a1.setBalance(accbal);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a1=new Account();
a1.setId(102);
a1.setNumber(6789);
a1.setBalance(70000);

Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount to withdraw");
int amt=sc.nextInt();

GooglePay gp=new GooglePay();
gp.withdraw(amt, a1);
System.out.println("Amount withdraw;Total balance: "+a1.getbalance());


Account a2 = new Account();
a2.setId(105);
a2.setNumber(1234);
a2.setBalance(70000);
gp.diposite(amt, a2);
System.out.println("Amount diposite;Total balance: "+a2.getbalance());

	}

}
