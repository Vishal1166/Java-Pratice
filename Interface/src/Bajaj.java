
public class Bajaj implements Bike {

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return "Bajaj";
	}

	@Override
	public String getcolor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 90000;
	}

	@Override
	public int getcc() {
		// TODO Auto-generated method stub
		return 250;
	}
	
	@Override
	public String toString() {
		return "\nModel :" + getname() + "\ncolor : " + getcolor() + "\nprice : " + getprice()
				+ "\npower : " + getcc();
	}
}
