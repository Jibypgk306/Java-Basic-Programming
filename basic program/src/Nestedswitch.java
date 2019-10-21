import java.util.Scanner;
public class Nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER BRANCH AND YEAR");
		char branch=s.next().charAt(0);
		int year=nextInt();
		switch(year)
		{
		case 1:
			System.out.println("ENGLISH,MATHS,SCIENCE");
			break;
		case 2:
			switch(branch)
			{
			case 'c':
				System.out.println("OS,JAVA,DS");
				break;
			case 'e':
				System.out.println("mulimedia");
				break;
			case 'm':
				System.out.println("DRAWING");
				break;
			default:
					System.out.println("INVALID!!");
					break;
			}
		case 3:
			switch(branch)
			{
			case 'c':
				System.out.println("DATA MINING");
				break;
			case 'e':
				System.out.println("SE");
				break;
			case 'm':
				System.out.println("MECHANICS");
				break;
			default:
					System.out.println("INVALID!!");
					break;
			}
		case 4:
			switch(branch)
			{
			case 'c':
				System.out.println("OS,JAVA,DS");
				break;
			case 'e':
				System.out.println("mulimedia");
				break;
			case 'm':
				System.out.println("DRAWING");
				break;
			default:
					System.out.println("INVALID!!");
					break;
			}
			
		}
		
		
	}

}
