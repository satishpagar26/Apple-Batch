package constructor;

public class Employee {
	private int id,salary;
	private String name;
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	int getsalary()
	{
		return salary;
	}
	void setName(String name)
	{
		this.name=name;
	}
       String getName()
       {
    	   return name;
       }
       
       void display()
       {
    	   System.out.println(id+"  "+name+"  "+salary);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Satish");
		e1.setSalary(35000);
		e1.display();
		
		Employee e2=new Employee();
		e2.setId(102);
		e2.setName("raj");
		e2.setSalary(40000);
		e2.display();
	}

}
