package assignments11;

public class Person {
 
	String name;
	String gender;
	int age;
	String adress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String toString()
	{
		return name+" "+gender+" "+age+" "+adress;
	}
	public void setid(IdProof id) {
		// TODO Auto-generated method stub
		
	}
}
