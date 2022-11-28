package inheritance_Parentchild;

public class Car {
	
	int price;
	int engine;
public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEngine() {
		return engine;
	}
	public void setEngine(int engine) {
		this.engine = engine;
	}
public void wheelno()
  {
	System.out.println("4 wheel");  
  }
  public  void headlights()
  {
	  System.out.println("2 headlights");
  
			
  }
  public String toString()
  {
	  return price+" "+engine;
  }
}
