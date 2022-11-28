package inheritance;

public class Adress {
	
	int pincode;
	String area,city,state;
	
	Adress(String area,String city,String state,int pincode)
	{
		this.area=area;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}
     public String toString()
     {
    	 return area+" "+city+" "+state+" "+pincode;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
