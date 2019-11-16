import java.util.*;
public class Me {
	public static void main(String args[])
		  {
		   Scanner sc=new Scanner(System.in);
		   
		    System.out.println("1.Current Account\n2.Savings Account");
		    int ch=sc.nextInt();
		    System.out.println("Name");
		    String name=sc.next();
		    System.out.println("Account number");
		    int accno=sc.nextInt();
		    System.out.println("Account balaence");
		    int accbal=sc.nextInt();
		    System.out.println("Date");
		    int startdate=sc.nextInt();
		    System.out.println("Year");
		    int year=sc.nextInt();
		     Display ob=new Account();
		    switch(ch)
		    {
		      case 1:
		      ob.current(name,accno,accbal,startdate,year);
		      break;
		      case 2:
		      ob.savings(name,accno,accbal,startdate,year);
		      break;
		      default :System.out.println("Invalid");
		      break;
		    }
		      }
		                       }
		    interface Details{
		      public void current(String name,int accno,int accbal,int startdate,int year);
		    }
		    interface Display extends Details{
		      public void savings(String name,int accno,int accbal,int startdate,int year);
		    }
		      class Account implements Display
		       {
		       public void current(String name,int accno,int accbal,int startdate,int year)
		       {
		         System.out.println("Name");
		         System.out.println("Account Number");
		         System.out.println("Account Balance");
		         System.out.println("Enter the start Date(yyyy-mm-dd)");
		         System.out.println("Enter the years");
		         System.out.println("Maintainence charge for Current Account 400.00");
		       }
		       public void savings(String name,int accno,int accbal,int startdate,int year)
		       {
		         System.out.println("Name");
		         System.out.println("Account Number");
		         System.out.println("Account Balance");
		         System.out.println("Enter the start Date(yyyy-mm-dd)");
		         System.out.println("Enter the years");
		         System.out.println("Maintainence charge for savings Account 550.00");
		       }
		     }
	}

}
