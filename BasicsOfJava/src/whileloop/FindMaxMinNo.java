package whileloop;

public class FindMaxMinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int min = num % 10;
	    int max = num % 10;
	    
		while (num != 0) 
		{
			int r = num % 10;
			if (r < min)
			{
				min = r;
			}
			num=num/10;
			if (r > max)
			{
				max = r;
			}
			num = num / 10;
			System.out.println("minimum digit is:"+min);
		    System.out.println("maximum digit is :" + max);

		}

	}
}