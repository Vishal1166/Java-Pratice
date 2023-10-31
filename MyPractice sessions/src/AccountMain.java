import java.util.List;

public class AccountMain
{
	public static void main(String[] args) {

    AccountInfo info=new AccountInfo();
    List<Account> lst= info.access();
    info.Display(lst);
	}
}
