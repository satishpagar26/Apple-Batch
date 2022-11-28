package oopsconcept;

public class Account {
	
    int id,number,balance;
	
	void setId(int id)
	{
		this.id=id;
	}
	int geId()
	{
		return id;
	}

	void setNumber(int number)
	{
		this.number=number;
	}
	int getnumber()
	{
		return number;
	}
	void setBalance(int balance)
	{
		this.balance=balance;
	}
	int getbalance()
	{
		return balance;
	}
	
	void display()
	{
		System.out.println(id+" "+number+" "+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}
	

}
