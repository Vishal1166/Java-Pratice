
public class Current extends Account
{
	
	private String coname;
    public Current(int acno, String actype, double acbal, String coname)
    {
		super(acno, actype, acbal);
		this.coname = coname;
	}
	public String getConame() {
		return coname;
	}
	public void setConame(String coname) {
		this.coname = coname;
	}
}
