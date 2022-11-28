package whileloop;

public class AdditionOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, limit = 20, sum = 0, sumo = 0;
		while (i <= limit)
		
			if (i % 2 == 0)
			{
				sum = sum + i;
			}
			else
			{
			sumo=sumo+i;
			
		}
		i--;
		System.out.println("Addition of even numbers:"+sum);
		System.out.println("Addition of odd numbers:"+ sumo);
	}
}