import java.util.List;

public class AccountMain
{
	public static void main(String[] args) 
	{
		AccountInfo info=new AccountInfo();
     	List<Account> lst=info.CreateAccount();
		
		Account a=new Account(100,"vishal",2500);
		info.insertAccount(lst, a);
		info.displayList(lst);
		info.deleteAccount(lst, a);
		info.displayList(lst);
		
		if(info.searchAccount(lst, a))
		{
			System.out.println("object found...");
		}
	}
}
