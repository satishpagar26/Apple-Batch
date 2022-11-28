package claasesandobjects;

public class Carr {
	
	int id,price;
	String name,color;
	Enginee e;
	
	Carr(int  id,String name,int price,String color,Enginee e)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.color=color;
		this.e=e;
	}

	public String toString()
	{
		return id+" "+name+" "+price+" "+color+"  \n"+e;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
