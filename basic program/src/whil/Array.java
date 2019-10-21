package whil;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int []a1=new int[size];
		int []a2=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter First array");
			a1[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println("enter second array");
			a2[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(a1[i]+a2[i]);
			
		}
		
	}

}
