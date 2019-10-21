package operators;
import java.util.Scanner;
public class Coordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter coordinate X1");
		int x1=s.nextInt();
		System.out.println("Enter coordinate X2");
		int x2=s.nextInt();

		System.out.println("Enter coordinate y1");
		int y1=s.nextInt();
		System.out.println("Enter coordinate y2");
		int y2=s.nextInt();
		x=(x1+x2)/2;
		y=(y1+y2)/2;
		System.out.println("MID POINT OF TWO COORDINATE IS:");
		System.out.println(x+" "+y);
		
		
		

	}

}
