package testingprograms;

public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print((char) (i + 96));
			}
			System.out.println();
		}
	}
}
