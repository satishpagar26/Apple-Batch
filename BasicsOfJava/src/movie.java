
public class movie {
  
	int yearofrelease;
	float profit;
	String producerName,actorName;
	
	void acceptDetails()
	{
	yearofrelease = 1997;
	profit = 120000.00f;
	producerName = "Mr. james";
	actorName = "Leonardo";
	}
	
	void showDetails() 
	{
		System.out.println("Movie profit is Rs."+  profit);
		System.out.println("Producer of the movie is "+ producerName);
	System.out.println("actor name of the movie is "+ actorName);
	System.out.println("year of relese of the movie is"+ yearofrelease);
	}
	
}
