package inheritance;

public class Car {

	int id,price;
	String name,color;
	Driver d;
	Car(int  id,String name,int price,String color,int did,String dname)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.color=color;
		

	d=new Driver(did,dname);
	}
	public String toString()
	{
		return id+" "+name+" "+price+" "+color+" \n"+d;
	}
}
