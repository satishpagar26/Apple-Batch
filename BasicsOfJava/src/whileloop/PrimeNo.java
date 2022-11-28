package whileloop;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, limit = 0, flag = 0;
		int n = 66;
		limit = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= limit; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		}
	}

}
