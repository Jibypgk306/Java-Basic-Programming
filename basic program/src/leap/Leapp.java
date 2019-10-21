package leap;

import java.util.Scanner;

public class Leapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int yr=s.nextInt();
		if((yr%4==0)&&(yr%100!=0)||(yr%400==0))
{
	System.out.println("Leap year");
}
	else
	{
		System.out.println("Not leap year");

	}
}
	}

