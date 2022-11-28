package whileloop;

public class WhileLoopEvenOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, limit = 10, sum = 0, sumo = 0, product = 1;
 
		while (i <= limit) {

			if (i % 2 == 0) {
				sum = sum + i;
				i++;

			} else {
				sumo = sumo + i;
				i++;

			}
		}
		System.out.println("Addition of EVEN number is:" + sum);
		System.out.println("Addition of ODD numbers is:" + sumo);
		{
			while (i <= limit)
				product = product * 1;
			i++;
			System.out.println("product is:" + product);

		}
	}
}
