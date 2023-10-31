
public class Saving extends Account
{
	private int intrest;
	public Saving(int acno, String actype, double acbal, int intrest)
	{
		super(acno, actype, acbal);
		this.intrest = intrest;
	}
	public int getIntrest() {
		return intrest;
	}
	public void setIntrest(int intrest) {
		this.intrest = intrest;
	}
}
