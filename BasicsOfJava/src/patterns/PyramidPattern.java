package patterns;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 4;
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");

			}

			System.out.println();

		}System.out.println("------Downward pattern------");
	
		for (int r = 4; r >= 1; r--)
		{
			for (int c = 1; c <= r; c++)
			{
				System.out.print("*");

			}

			System.out.println();
		}
	}
}
