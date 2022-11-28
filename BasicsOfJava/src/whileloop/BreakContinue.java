package whileloop;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int limit= 20,c=0;

while(c<limit)
{
	c++;
	if(c%3==0)
	{
		break;
}
		System.out.println(c+" ");
}System.out.println("out of loop:" );
	}

}
