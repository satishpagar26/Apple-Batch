package test4;

import java.util.Scanner;

public class Box {

	int calculate (int length, int width, int height)
	{
		int volume=length*width*height;
		return volume;
	}
	
	void display(int volume) {
		System.out.println("volume of box is:" + volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l, w, h;
		System.out.println("Enter the length,width,height");
		l = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();

		Box b = new Box();
		int volume = b.calculate(l, w, h);
		b.display(volume);
	}

}
