package inheritance;

public class College1 {
	
	private int code;
	private String name,adress;
	
	Department dept;
	Library lb;
	
	public College1(int code,String name,String adress)
	{
		this.code=code;
		this.name=name;
		this.adress=adress;
	}
public String toString()
{
	return code+" "+name+" "+adress;
}
}
