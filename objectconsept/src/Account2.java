
public class Account2 {
	
	private int accno;
	private String cname;
	private double abal;
	
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

	public Account2(int accno, String cname, double abal) {
	
		this.accno = accno;
		this.cname = cname;
		this.abal = abal;
	}

	@Override
	public String toString() {

		return getAccno()+"\t"+getCname()+"\t"+getAbal();
	}

	@Override
	public boolean equals(Object obj) {
		
		Account2 aobj=(Account2)obj;
		
				if(aobj.getAccno()==this.getAccno())
				{
					return true;
				}
		return false;
	}

	@Override // garbage collection
	protected void finalize() throws Throwable {
		// used for close file or socket or database...
		System.out.println("object destroyed...");
	}
	
	

}
