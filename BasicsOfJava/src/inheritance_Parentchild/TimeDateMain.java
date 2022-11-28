package inheritance_Parentchild;

public class TimeDateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		MyDate md=new MyDate();
		md.setDd(26);
		
		MyTime mt=new MyTime();
		mt.setHrs(11);
		mt.setMins(34);
		mt.setSecs(56);
		
		md.setDd(28);
		md.setMm(11);
		md.setYy(2022);
		System.out.println(mt);
		System.out.println(md);
	}

}
