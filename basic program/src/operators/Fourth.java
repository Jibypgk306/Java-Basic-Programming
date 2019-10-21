package operators;
import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int d;
int c;
int m;
int a;
int b;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 a=n%10;
		 b=a*a;
		 c=n/100;
		 d=c*a;
		 m=b*d;
		 System.out.println(b+""+d);
		 System.out.println(m);

	}
}
