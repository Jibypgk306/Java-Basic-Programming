package basics;

import java.util.Scanner;

public class Round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		int d=s.nextInt();
		System.out.printf(" %-15s  %03d\n",a,d);
		s.nextLine();
		String c=s.nextLine();
		int e=s.nextInt();
		System.out.printf(" %-15s %03d\n",c,e);
	}

}
