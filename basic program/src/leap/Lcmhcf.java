package leap;

import java.util.Scanner;

public class Lcmhcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBERs");
		int a=s.nextInt();
		int b=s.nextInt();
		double gcd=0;
		int lcm=0;
		int min=(a>b)?a:b;
		for(int i=min;i>0;i--)//decrement the i value
		
			if(a%i==0 && b%i==0)//factor will find here
			{
		gcd=i;//divisor will store in gcd.ie,i
		break;//if no break,the loop will continue and reach zero.then it will print 1.so we use break
	}
		int max=(a>b)?a:b;
		{
			for(int i=max;;i++)//i<=a*b;
			{
				if(i%a==0 && i%b==0)
				{
			lcm=i;//multiples will be divisors.ie i
			break;
		}
		
}
			System.out.println("GCD:"+gcd);

		System.out.println("LCM:"+lcm);
	}
}
}
