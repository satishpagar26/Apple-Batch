package assignments11;

public class PersonIdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		IdProof id=new IdProof();
		id.setNumber(101);
		id.setName("Anuj");
		id.setAdress("Nashik");
		
		Person p1=new Person();
		p1.setName("Anuj");
		p1.setGender("Male");
		p1.setAge(24);
		p1.setid(id);
		
		
		
		
		
		System.out.println(p1);
		System.out.println(id);
	}

}
