import java.util.LinkedList;
import java.util.*;

public class AccountInfo
{
	Scanner sc=new Scanner(System.in);
	  
    	public List<Account>  access()
    	{
    	    List<Account> lst=new LinkedList<Account>();
     	   do
     	    {
     		   System.out.println("enter account no,name, bal");
     		   Account a=new Account(sc.nextInt(),sc.next(),sc.nextDouble());
     		   lst.add(a);
     		   System.out.println("Do you want to continue press yes/no"); 	    	
     	    }while(sc.next().equals("yes"));
     	   return lst;
    	}
    	public static void Display(List<Account> lst)
    	{
    		for(Account a: lst)
    			System.out.println(a.getAccno()+"\n"+a.getCname()+"\n"+a.getAbal());
    	}
    
}

