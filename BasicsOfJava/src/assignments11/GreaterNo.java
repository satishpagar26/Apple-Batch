package assignments11;

public class GreaterNo {
	
	int a ,b;
	
	void compare(int a,int b)
	{
		if(a>b)
		{
			System.out.println("greater no is:" +a);
		}
		else
		{
			System.out.println("greater no is:" +b);
		}
	
	}
	
	public String toString()
	{
		return a+" "+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreaterNo g=new GreaterNo();
		g.compare(10, 20);
		
		System.out.println(g);
	}
}