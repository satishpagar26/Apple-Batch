package claasesandobjects;

public class Enginee {
	
	int cylinder,torque;
	String rpm,company;
	
	Enginee(String company,int cylinder,int torque, String rpm)
	{
		this.company=company;
		this.cylinder=cylinder;
		this.torque=torque;
		this.rpm=rpm;
	}
	
	public String toString()
	{
		return "company: "+company+"\nrpm:	"+rpm+" "+cylinder+"cylinder "+torque+"nanometer";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
