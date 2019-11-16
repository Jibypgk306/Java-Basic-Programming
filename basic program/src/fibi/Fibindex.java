package fibi;
import java.util.*;
public class Fibindex {
public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a digit");
			int n=s.nextInt();
			int a=0,b=1,sum=0;
			for(int i=0;i<n;i++) {
			sum=a+b;
			a=b;
			b=sum;
			}
			System.out.println("Index:"+sum);
			}
			}