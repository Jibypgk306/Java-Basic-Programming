package Decisionmaking;

import java.util.Scanner;

public class Ladderif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE BLOOD GROUP");
		String b=s.next();
		if(b.equals("a"))
		{
			if(b.equals("a+"))
			{
				System.out.println("A+");
			}
			else
			{
				System.out.println("A-");
			}
		}
			else if(b.equals("b"))
			{
				if(b.equals("b+"))
				{
					System.out.println("B+");
				}
				else
				{
					System.out.println("B-");
				}
			}
	}
}
