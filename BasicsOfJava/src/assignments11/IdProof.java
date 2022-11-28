package assignments11;

public class IdProof {
  int number;
  String name;
  String adress;
  
  
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String toString()
{
	return number+" "+name+" "+adress;
}
}
