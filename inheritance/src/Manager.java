
public class Manager extends Employee
{
	private int bonus;
	public Manager(int eid, String ename, double esal, int bonus)
	{
		super(eid, ename, esal);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	

}
