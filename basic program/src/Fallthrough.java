import java.util.Scanner;
public class Fallthrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Numbers");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:System.out.println("31 days");
		break;
		case 4:
		case 6:
		case 9:
		case 11:
		case 12:System.out.println("30 Days");
		break;
		case 2:System.out.println("29 OR 28 Days");
		break;
		default:
			System.out.println("INVALID!!");
		}
	}

}