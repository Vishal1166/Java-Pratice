
public class Customer {
	
	private int cid;
	private String cname;
	private String mobno;
	
	private Account aobj;
	private Address addr;
	
	public Customer(int cid, String cname, String mobno, Account aobj, Address addr) {
		this.cid = cid;
		this.cname = cname;
		this.mobno = mobno;
		this.aobj = aobj;
		this.addr = addr;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public Account getAobj() {
		return aobj;
	}
	public void setAobj(Account aobj) {
		this.aobj = aobj;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}

}
