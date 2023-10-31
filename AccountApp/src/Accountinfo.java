import java.util.Scanner;
//class 2 
public class Accountinfo      // info class       // privide security
{
	public Account[] create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many object do you want : ");
		int n=sc.nextInt();
		Account arr[]=new Account[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter accno  customer name  accbal ");
			int accno=sc.nextInt();
			String cname=sc.next();
			double accbal=sc.nextDouble();
		    Account a1=new Account(accno,cname,accbal);
	        arr[i]=a1;
		}
		return arr; //return array to multi function
	}
		
	public void display(Account a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("-------------------------------------------");
		System.out.println(" Acc no         : "+a[i].getAccno());
		System.out.println(" customer name  : "+a[i].getCname());
		System.out.println(" Acc balance    : "+a[i].getAbal());
		}
	}

}
