package patterns;

public class SeriesProgramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 1, n = 60;
		if (n > 0) {
			while (i <= n) {
				System.out.print(i + " ");
				i = i + (j * j);
				j++;
			}
		}

	}
}