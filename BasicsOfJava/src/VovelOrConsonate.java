import java.util.Scanner;

public class VovelOrConsonate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch;
System.out.println("Enter a character");
Scanner sc = new Scanner(System.in);
ch = sc.next().charAt(0);
if(ch=='A'  || ch == 'a')
System.out.println("Given character is a wovel");
else if (ch=='I'  || ch=='i')
System.out.println("Given character is a wovel");
else if (ch=='E'  || ch=='e')
System.out.println("Given character is a wovel");
else if (ch=='o'  || ch=='O')
System.out.println("Given character is a wovel");
else if(ch=='U'||  ch=='u')
System.out.println("Given character is a wovel");

else {
	System.out.println("Given character is a Consonant");
     }
	}
}
	
