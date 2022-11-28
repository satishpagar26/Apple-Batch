package inheritance;

public class Department1 {

	private int id;
	private String name;
	
	public Department1(int id,String name) {
		
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
}
