package controlstructure;
import java.util.Scanner;

public class Pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f=s.nextInt();
		int l=s.nextInt();
		int su=0;
		for(int i=0;i<=n;i++)
		{
			su=((f+l)*n)/2;
		}
		System.out.println(su);

	}

}
