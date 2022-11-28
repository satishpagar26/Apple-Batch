package inheritance;

public class PersonAdressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person1 p=new Person1();
		p.setId(101);
		p.setName("Anuj");
		p.setContact(987654763);
		p.setEmail("anuj@gmail.com");
		p.setAdress("Moshi");
		
		Adress1 a =new Adress1();
		a.setArea("Moshi");
		a.setCity("Pune");
		a.setState("Maharashtra");
		a.setPincode(411057);
		
		System.out.println(p);
		System.out.println(a);
		
	}

}
