
public class Account
{
	private int accno;
	private String custname;
	private double accbal;
	public Account(int accno, String custname, double accbal) {
		
		this.accno = accno;
		this.custname = custname;
		this.accbal = accbal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	

}
