package claasesandobjects;

public class Shopping {
	String itemname;
	float price;
	int quantity;
	void acceptDetails(String s ,float p, int q)
	{
		itemname=s;
		price =p;
		quantity=q;
	}
	void calculateBill()
	{
		if(quantity>0)
		System.out.println("Toatl bill:  "+(price*quantity));
		else
			System.out.println("error");
	}
	void display()
	{
		System.out.println("item name:  "+itemname+"\nitem price:  "+price+"\nquantity:  "+quantity);
	}
	public  static void main(String[]args) {
		Shopping s= new Shopping();
		s.acceptDetails("mobile", 15000.00f, 0);
		s.display();
		s.calculateBill();
	}
	
}