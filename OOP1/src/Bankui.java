import java.util.Scanner;

public class Bankui { 
	Scanner sc=new Scanner(System.in);
	 
	public static Customer create()
	{
		Account aobj=new Account(1085,"saving",1000);
		Address addr=new Address("chalisgaon","MH",424101);
	    Customer cust=new Customer(201,"vishal","9890185516",aobj, addr);	
	   return cust;
	}
	public static void display(Customer cust)
	{
		System.out.println("Customer id    : "+cust.getCid());
		System.out.println("Customer name  : "+cust.getCname());
		System.out.println("Customer mobno : "+cust.getMobno());
		System.out.println("-----------Account Details--------------");
		System.out.println("Account no    : "+cust.getAobj().getAccno());
		System.out.println("Account type  : "+cust.getAobj().getAtype());
		System.out.println("Account bal   : "+cust.getAobj().getAbal());
		System.out.println("---------------Address------------------");
		System.out.println(" City    : "+cust.getAddr().getCity());
		System.out.println("State    : "+cust.getAddr().getState());
		System.out.println("Pincode  : "+cust.getAddr().getPincode());
	}
	public void transaction(Customer cust)
	{
		Transaction t=new Transaction();
		
		System.out.println("1-withdrawal\n2-deposit");
	    int ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("enter withdrawal amount : ");
			t.withdrawal(cust.getAobj(),sc.nextDouble());
		}
		if(ch==2)
		{
			System.out.println("enter deposit amount : ");
			t.deposit(cust.getAobj(), sc.nextDouble());
		}
	}
}
