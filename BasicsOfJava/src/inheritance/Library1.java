package inheritance;

public class Library1 {

	private int notebooks;
	private String incharge;
	
	
	public Library1(int notebook,String incharge, int notebooks) {
		this.notebooks=notebooks;
		this.incharge=incharge;
	}
	
	public String toString()
	{
		return notebooks+" "+incharge;
	}
}
