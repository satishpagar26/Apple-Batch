package forloop;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153, cnt = 0, sum = 0;
		int temp = num;

		while (temp != 0) {
			cnt++;
			temp = temp / 10;
		}
		int temp1 = num;
		while (temp1 != 0)
		{
			int power = 1;
			int r = temp1 % 10;
			for (int i = 1; i <= cnt; i++) {
				power = power * r;
			}
			sum = sum + power;
			temp1 = temp / 10;

		}
		if (sum == num)
			System.out.println("its a armstrong no");
		else
			System.out.println("its not a armstrong no");
	}

}
