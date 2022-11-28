package inheritance;

public class Person {

	int id;
	String name,contact,email,adress;
	
	Person(int id,String name,String contact,String email,String adress)
	{
	this.id=id;
	this.name=name;
	this.contact=contact;
	this.email=email;
	this.adress=adress;
   }
	
	public Person(int id2, String name2, String contact2, String email2, Adress a) {
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return id+" "+name+" "+contact+" "+email+" "+adress;
	}
}