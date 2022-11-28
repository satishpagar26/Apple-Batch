package assignments11;

public class FunctionSeries {

    int n;
	double series(double n)
	{
		double sum=0;
		for(int i=1;i<=n;i++)
			sum=(sum+(1.0/i));
	
	return sum;
	}
double series(double a ,double b)
{
	double sum=0.0,count=1.0,val=2.0;
	for(int i=1;i<=n;i++)
	{
		sum=sum+(count/Math.pow(a, val));
		count=count+3;
		val=count+1;
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 FunctionSeries f= new FunctionSeries();
		 double series1=f.series(5);
		 double series2=f.series(4, 5);
		 
		 System.out.println(series1);
		 System.out.println(series2);
	}

}
