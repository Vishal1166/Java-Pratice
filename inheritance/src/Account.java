
public class Account {
	private int acno;
	private String actype;
	private double acbal;
	
	public Account(int acno, String actype, double acbal) {
		super();
		this.acno = acno;
		this.actype = actype;
		this.acbal = acbal;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getActype() {
		return actype;
	}

	public void setActype(String actype) {
		this.actype = actype;
	}

	public double getAcbal() {
		return acbal;
	}

	public void setAcbal(double acbal) {
		this.acbal = acbal;
	}
	

}
