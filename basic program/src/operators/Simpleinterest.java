package operators;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int p=s.nextInt();
int n =s.nextInt();
float r=s.nextFloat();
float i=p*n*r/100;
System.out.printf("%.2f\n",i);
	}
}
