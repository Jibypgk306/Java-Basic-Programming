package whil;
import java.util.Scanner;
import java.util.Arrays;
public class Secondlarg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int []a1=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		a1[i]=s.nextInt();
		for(int i=0;i<size;i++)
		Arrays.parallelSort(a1);
		System.out.println(a1[size-2]);
		
		
	}
}
