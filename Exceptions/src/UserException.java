import java.util.Scanner;
public class UserException 
{

public static void openAccount(int accno,String cname, double abal,int age) throws InvalidAgeException,InvalidBalException 
{
	try
	{
	if(abal<1000)
	     {
		    throw new InvalidBalException(abal);
    	 }
	     System.out.println("valid data...you can  open Account");
	}
	catch(InvalidBalException ex)
	{
		System.out.println("Exception is : "+ex);
		throw ex;
	}
	
	try
	{
		if(age<18)
		{
			throw new InvalidAgeException(age);
		}
		System.out.println("your age valid to open new account...thank you");
	}
	catch(InvalidAgeException ex)
	{
		System.out.println("Exeption : "+ex);
		throw ex;
	}
}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter customer no");
		int accno=sc.nextInt();
		
		System.out.println("Enter customer name : ");
		String cname=sc.next();
		
		System.out.println("Enter customer bal ");
		double abal=sc.nextDouble();
		
		System.out.println("enter customer age :");
		int age=sc.nextInt();
		try
		{
		openAccount(accno, cname, abal, age);
		System.out.println("your account is open...");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		System.out.println("----------thank you..visit again------------");

	}

}
