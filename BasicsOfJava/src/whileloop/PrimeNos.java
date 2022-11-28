package whileloop;

public class PrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 300, b = 400, cnt;

		for (int n = a; n <= b; n++) {
			cnt = 0;

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println(n);
			}
		}
	}

}
