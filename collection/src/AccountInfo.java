import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AccountInfo
{ 
	Scanner sc=new Scanner(System.in);
	
 public List<Account> CreateAccount()
 {
	 List<Account> lst=new LinkedList<Account>();
	 do
	 {
	 System.out.println(" Account no, Customer name, Account Bal ");
	 lst.add(new Account(sc.nextInt(),sc.next(),sc.nextDouble()));
	 System.out.println("Do you want to add more obj press yes : ");
	 }while(sc.next().equals("yes"));
	 return lst;
 }
 public void displayList(List<Account> lst)
 {
	 for(Account a: lst)
	 {
		 if(a.getAccbal()>2000)    // jr balace 2000 peksha jast asel trch display hoil
		 {
		 System.out.println(a.getAccno()+"\t"+a.getCustname()+"\t"+a.getAccbal());
		 }
	 }
 }
 
 public void insertAccount(List<Account> lstList, Account a)
 {
	 System.out.println("whitch position do you want to  add account no =100 ");
	 lstList.add(sc.nextInt(),a);  
	 System.out.println("new object is inserted...");
 }
 
 public void deleteAccount(List<Account> lstList, Account a)
 {
	 lstList.remove(a);
	 System.out.println("object removed....");
 }
 
 public boolean searchAccount(List<Account> lstList, Account a)
 {
	 boolean b= lstList.contains(a);
			 if(b)
			 {
				 System.out.println("object found...");
			 }
	 return b;
 }
}
