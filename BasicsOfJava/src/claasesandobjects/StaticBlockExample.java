package claasesandobjects;

public class StaticBlockExample {

	int a;
	static int count;

	static {
		count++;
		System.out.println("In static block 1");
	}

	static {
		count++;
		System.out.println("In static block 2");
	}
	static {
		count++;
		System.out.println("In static block 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count);
	}

}
