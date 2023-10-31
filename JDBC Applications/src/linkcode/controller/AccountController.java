package linkcode.controller;
import java.util.List;
import java.util.Scanner;

import linkcode.dao.AccountDao;
import linkcode.dao.AccountInterface;
import linkcode.model.Account;
public class AccountController
{	
	Scanner sc=new Scanner(System.in);

	public Account create()
	{
		Account a=new Account(sc.nextInt(),sc.next(),sc.nextDouble());	
		return a;	
	}
 public void save(Account aobj)   // this is our display method we always use 
 {
	 AccountInterface ai=new AccountDao();  // this call as dynamic polymorefisam
	int i=ai.create(aobj);
	 if(i>0)
	     {
		 System.out.println("Account created succesfully...");
		 }
 }
 public void delete(int accno)
 {
	 AccountInterface ai=new AccountDao(); 
	 int i=ai.delete(accno);
	 if(i>0)
     {
	 System.out.println("record deleted...");
	 }
 }
 public void update(Account a)
 {
	 AccountInterface ai=new AccountDao(); 
	int i=ai.update(a);
	if(i>0)
	{
		System.out.println("record update..");
		}	 
 }
 public void Search(int accno)
 {
	 AccountInterface ai=new AccountDao(); 
	List<Account> lst= ai.Search(accno);
	 for(Account a: lst)
	 {
		 System.out.println(a.getAccno()+"\t"+a.getCustname()+"\t"+a.getAccbal());
	 }
 }
 public void DisplayAll()
 {
	 AccountInterface ai=new AccountDao(); 
	 List<Account> lst=ai.DisplayAll();
	 for(Account a: lst)
	 {
		 System.out.println(a.getAccno()+"\t"+a.getCustname()+"\t"+a.getAccbal());
	 }
 }
}
