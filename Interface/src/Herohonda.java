
public class Herohonda implements Bike {

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return "HeroHonda";
	}

	@Override
	public String getcolor() {
		// TODO Auto-generated method stub
		return "grey";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 80000;
	}

	@Override
	public int getcc() {
		// TODO Auto-generated method stub
		return 180;
	}

	@Override
	public String toString() {
		return "\nModel : " + getname() + "\n color :" + getcolor() + "\nprice : " + getprice()
				+ "\npower : " + getcc();
	}
	

}
