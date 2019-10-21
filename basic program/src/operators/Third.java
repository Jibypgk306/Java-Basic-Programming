package operators;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int n=a%10;
int c=a/10;
int d=n*c;
int e=c*c;
System.out.println(d+""+e);

int x=s.nextInt();
int y=x%10;
int z=x/10;
int p=y*z;
int q=z*z;
System.out.println(p+""+q);
	}

}
