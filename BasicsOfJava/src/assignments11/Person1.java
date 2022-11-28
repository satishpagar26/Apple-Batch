package assignments11;

public class Person1 {
   String name;
   int age;
   String gender;
   int contact;
   String Idproof ;
   
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}
public String getIdproof() {
	return Idproof;
}
public void setIdproof(String idproof) {
	this.Idproof = idproof;
}
public String toString()
{
 return name+" "+age+" "+contact+" "+Idproof;
}
}