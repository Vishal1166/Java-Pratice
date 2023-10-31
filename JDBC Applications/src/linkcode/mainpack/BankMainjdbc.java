package linkcode.mainpack;
import java.util.Scanner;

import linkcode.controller.AccountController;
import linkcode.model.Account;
public class BankMainjdbc
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch=0;
		AccountController ac=new AccountController();	
		do
		{
			System.out.println("---------WELCOME TO HDFC BANK---------------\n");
			System.out.println("---------MAIN MENU----------");
			System.out.println("1-Insert record\n2-Delete\n3-Update\n4-Search\n5-Display table");
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
		if(ch==1)
		{	
			do
			{
			System.out.println("enter Account no , name , balance ");
			Account aobj=ac.create();
			ac.save(aobj);
			System.out.println(" insert more record press yes/no");
			}while(sc.next().equals("yes"));
		}
		else if(ch==2)
		{
			System.out.println("enter Account no to delete record");
			ac.delete(sc.nextInt());	
		}
		else if(ch==3)
		{
			System.out.println("enter account no and new Balance to update record ");
			Account a=new Account();
			 a.setAccno(sc.nextInt());
			 a.setAccbal(sc.nextDouble());
			 ac.update(a);
		}
		else if(ch==4)
		{
			 System.out.println("enter account no to search record");
		      ac.Search(sc.nextInt());	
		}
		else if(ch==5)
		{
			 ac.DisplayAll();
		}	     
	      System.out.println("go to Main Menu press yes/no :");
		}while(sc.next().equals("yes"));
		System.out.println("-----------------THANK YOU--------------------");
	}
}
