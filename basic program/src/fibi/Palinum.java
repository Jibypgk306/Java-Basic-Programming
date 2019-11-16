package fibi;
import java .util.*;
public class Palinum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=0;
		int n=s.nextInt();
		int t=n;
		while(n>0)
		{
		int a=n%10;
		r=r*10+a;
		n=n/10;
		}
		if(r==t)
		{
		System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");

		}
	}
}
