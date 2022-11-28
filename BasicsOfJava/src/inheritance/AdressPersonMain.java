package inheritance;

public class AdressPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Adress a=new Adress("wakad","pune","maharashtra",411057);
 
   Person p1=new Person(101,"rahul","9865498765","rahul@gmail.com",a);
   Person p2=new Person(102,"amol","986456465","amol@gmail.com",a);
   Person p3=new Person(103,"vaibhav","9655498765","vaibhav@gmail.com",a);
   
   
   
   System.out.println(a);
   System.out.println(p1);
   System.out.println(p2);
   System.out.println(p3);
  
	}
	
}
