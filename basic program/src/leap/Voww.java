package leap;

import java.util.Scanner;
import java.io.*;

public class Voww {

	public static void main(String[] args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size");
		int n=Integer.parseInt(br.readLine());
		System.out.println("enter elements");
		String a[]=new String[n];
		char c;
		for(int i=0;i<n;i++)
			{
				a[i]=br.readLine();
			}
		for(int i=0;i<n;i++)
		{
			c=a[i].charAt(0);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println(a[i]);
			}
		}

	}

}
