package whil;
import java.util.Scanner;
public class Arryodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int []a1=new int[size];
		int sum=0;
		int sum1=0;
		int b=0;int c=0;
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter elements");
			a1[i]=s.nextInt();
		}
	
		for(int i=0;i<size;i++)
		{
			if(a1[i]%2==0)
			{
				System.out.println(a1[i]);
				sum=sum+a1[i];
				b++;//to find avg
			}
		}
				for(int i=0;i<size;i++)
				{
					if(a1[i] %2!=0)
					{
						System.out.println(a1[i]);
						sum1=sum1+a1[i];
						c++;//to find avg
					}
			}
				int e=sum/b;
				int o=sum1/c;
				System.out.println(o);
				System.out.println(e);
			}		
		}