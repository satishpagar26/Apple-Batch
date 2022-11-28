package assignments11;

public class PersonAdressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 Person p1=new Person();
		 p1.setName("Raj");
		 p1.setGender("Male");
		 p1.setAge(24);
		 p1.setAdress("Nashik");
				 
		 
		 Adress a1=new Adress();
		 a1.setCity("Nashik");
		 a1.setState("Maharashtra");
		 a1.setCountry("India");
		 
		 System.out.println(p1);
		 System.out.println(a1);
	}

}
