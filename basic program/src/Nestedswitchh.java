import java.util.Scanner;
public class Nestedswitchh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				Scanner s= new Scanner(System.in);
				System.out.println("ENTER BRANCH AND YEAR");
				int year=s.nextInt();
				switch(year)
				{
				case 1:
					System.out.println("ENGLISH,MATHS,SCIENCE");
					break;
				case 2:
					char branch=s.next().charAt(0);

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
					char br=s.next().charAt(0);
					switch(br)
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
					char b=s.next().charAt(0);
					switch(b)
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
