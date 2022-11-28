package whileloop;

public class AdditionOfNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=3113,sum=0,product=1,cnt=0;
while(num!=0)
{
	int r=num%10;
	sum=sum+r;
	product=product*r;
	cnt++;
	num=num/10;
}
System.out.println("Addition is :"+  sum);
System.out.println("Product is:"  +product);
System.out.println("Cnt is :" + cnt);
	
	}

}
