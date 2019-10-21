package operators;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		t=a;
		a=b;
		b=t;
		System.out.println(a);
		System.out.println(b);
	}
}