package Decisionmaking;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE LAPTOP YOU WANT");
		String hp=s.nextLine();
		int ram=s.nextInt();
		int hd=s.nextInt();
		if(hp.equals(hp))
		{
			if(ram==16)
			{
				if(hd==2)
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
