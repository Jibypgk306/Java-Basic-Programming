package fibi;
import java.util.*;
public class Fibsum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int a=0;
		int b=1;
		int esum=0;
		int osum=0;
		for(int i=1;i<n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			if(i%2==0)
			{
				esum=esum+c;

			}
			else
			{
				osum=osum+c;
			}
		}
		System.out.println("Even sum:"+esum);
		System.out.println("Oddsum:"+osum);

}
}