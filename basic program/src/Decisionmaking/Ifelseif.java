package Decisionmaking;

import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE MARK");
		int grade=s.nextInt();
		if(grade>=95)
		{
			System.out.println("Grade is:  A");
	}
		else if(grade <95 && grade >=80)
		{
			System.out.println("Grade is: B");
		}
		
		else if(grade <80 && grade >=70)
		{
			System.out.println("Grade is: C");
		}
		else
		{
			System.out.println(" SORRY YOU ARE FAILED!!");
		}
}
}
