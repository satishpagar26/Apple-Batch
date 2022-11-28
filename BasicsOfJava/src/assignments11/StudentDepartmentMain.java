package assignments11;

public class StudentDepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department d1=new Department();
		d1.setId(101);
		d1.setName("Raj");
		
		Student s1=new Student();
		s1.setRollno(5);
		s1.setName("Raj");
		s1.setDepartment("computer");
		
		System.out.println(d1);
		System.out.println(s1);
	}

}
