
public class Account
{
    private int accno;
    private String cname;
    private double abal;
	public Account(int accno, String cname, double abal) {

		this.accno = accno;
		this.cname = cname;
		this.abal = abal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getAbal() {
		return abal;
	}
	public void setAbal(double abal) {
		this.abal = abal;
	}

    
}
