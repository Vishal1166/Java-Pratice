
public class Transaction {
	
	public void deposit(Account a, double amount)
	{
      double bal=a.getAbal()+amount;
      a.setAbal(bal);
	}
	public void withdrawal(Account a,double amount)
	{
		double bal=a.getAbal()-amount;
		a.setAbal(bal);
	}

}
