
public class Devloper extends Employee{
	
	private int noofhr; 

	public Devloper(int eid, String ename, double esal, int noofhr) {
		super(eid, ename, esal);
		this.noofhr = noofhr;
	}

	public int getNoofhr() {
		return noofhr;
	}

	public void setNoofhr(int noofhr) {
		this.noofhr = noofhr;
	}
	
	

}
