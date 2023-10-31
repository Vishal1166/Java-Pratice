
public class Account {
	
	private int accno;
	private String atype;
	private double abal;
	
	public Account(int accno, String atype, double abal) {
		
		this.accno = accno;
		this.atype = atype;
		this.abal = abal;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccid(int accno) {
		this.accno = accno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public double getAbal() {
		return abal;
	}

	public void setAbal(double abal) {
		this.abal = abal;
	}
	

}
