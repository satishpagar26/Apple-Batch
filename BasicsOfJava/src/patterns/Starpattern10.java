package patterns;

public class Starpattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 6 - i; k >= 1; k--) {
				System.out.print("  ");
			}
			for (int l = i; l >= 1; l--)

			{
				System.out.print(l);
			}
			System.out.println();
		}

	}
}
