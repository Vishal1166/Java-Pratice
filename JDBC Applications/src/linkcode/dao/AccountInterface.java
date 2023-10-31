package linkcode.dao;
import java.util.LinkedList;
import java.util.List;
import linkcode.model.Account;
public interface AccountInterface 
{
	int create(Account aobj);
	LinkedList<Account> Search(int ano);
	int update(Account a);
	int delete(int accno);
	List<Account> DisplayAll();
}
