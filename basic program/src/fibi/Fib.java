package fibi;
import java.util.*;
public class Fib {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int s1=0,i;
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(i=1;i<n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
		System.out.println(c);
		}
			int r=i%10;
			s1=r*10+s1;
			i=i/10;	
			System.out.println(s1);
		}
}