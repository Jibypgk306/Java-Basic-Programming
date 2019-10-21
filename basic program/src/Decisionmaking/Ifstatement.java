package Decisionmaking;

import java.util.Scanner;

public class Ifstatement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE AGE");
		int age=s.nextInt();
		if(age>=18)
		{
			System.out.println("YOU ARE ELIGIBLE");
		}
		else
		{
			System.out.println("YOU ARE NOT ELIGIBLE");
		}
		
	}

}
