package claasesandobjects;

public class Outer {

	int a = 10;
	static int b = 20;


		void display() {
			System.out.println(a);
		}
		static class inner {
			void display()
			{
				System.out.println(b);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.inner o =new Outer.inner();
		o.display();
		System.out.println();
	}

}
