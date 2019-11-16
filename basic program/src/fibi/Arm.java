package fibi;
import java .util.*;
public class Arm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		int n=s.nextInt();
		int t=n;
		while(n>0)
		{
		int a=n%10;
		sum=sum+a*a*a;
		n=n/10;
		}
		if(sum==t)
		{
		System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}
