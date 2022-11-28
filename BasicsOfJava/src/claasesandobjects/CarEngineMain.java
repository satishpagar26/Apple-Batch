package claasesandobjects;

import oopsconcept.Engine;

public class CarEngineMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Engine e1=new Engine();
  e1.setRpm("1000 rpm");
  e1.setCylinder(4);
  e1.setTorque(90);
  e1.setCompany("SCODA");
  
  
  Car c1=new Car();
  c1.setId(1001);
  c1.setName("superb");
  c1.setName(2400000);
  c1.setcolor("Black");
  c1.setE(e1);

  
		System.out.println("Information of car:  ");  
		System.out.println("Name: "+c1.getName()+" \nPrice: "+c1.getPrice()+" \nColor: "+c1.getcompany());
	}

}
