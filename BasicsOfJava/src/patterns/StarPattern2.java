package patterns;

public class StarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i , j,n=5;
		
		for ( i = 1; i <= n; i++) 
		{
			for (j = 1; j <= i; j++)
			{
				System.out.print((char)(i+96));
			}
			System.out.println();
		}	
	}

}
