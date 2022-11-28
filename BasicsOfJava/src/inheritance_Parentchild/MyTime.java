package inheritance_Parentchild;

public class MyTime {
     
	int hrs,mins,secs;

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	public int getSecs() {
		return secs;
	}

	public void setSecs(int secs) {
		this.secs = secs;
	}
	public String toString()
	{
		return hrs+" "+mins+" "+secs;
	}


}
