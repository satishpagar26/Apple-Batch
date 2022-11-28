package PracticeProgramm;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		char i,j;
		for ( i = 1; i <= num; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
		
	}

}
