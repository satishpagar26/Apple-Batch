package assignments11;

public class Greaterchar {
	
	private String a;
	private String z;

	void compare(char a,char z)
	{
		if(a>z)
		{
		System.out.println("greater char is:"+a);
		}
		else
		{
			System.out.println("greater char is:"+z);
		}
	}
	public String toString()
	{
		return a+" "+z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Greaterchar g=new Greaterchar();
		char a;
		char z;
		g.compare('a', 'z');
		System.out.println(g);
	}

}
