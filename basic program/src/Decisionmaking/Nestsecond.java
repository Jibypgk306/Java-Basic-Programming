package Decisionmaking;

import java.util.Scanner;

public class Nestsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE dress YOU WANT");
		String jeans=s.nextLine();
		int size=s.nextInt();
		int qty=s.nextInt();
		if(jeans.equals(jeans))
		{
			if(size==16)
			{
				if(qty==2)
				{
					System.out.println("AVAILABLE");

				}
				
				else
				{
					System.out.println(" NOT 2t");	
				}
			}//ramif
				else
				{
					System.out.println("not  16 gb AVAILABLE");
				}//ramelse
			
		}
				else
				{
					System.out.println("SORRY!!");
				}

	}

}
