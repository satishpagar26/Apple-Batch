package constructor;

public class AssignTheValue {

	int num;
	String name;

	public AssignTheValue(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	void AssignTheValue(int num, String name) {
		this.num = num;
		this.name = name;
	}

	AssignTheValue(AssignTheValue A) {
		num = A.num;
		name = A.name;
	}


	public AssignTheValue(int A) {
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println(num + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignTheValue A1 = new AssignTheValue(121, "raj");
		AssignTheValue A2 = new AssignTheValue(1);

		A1.display();
		A2.display();
	}

}
