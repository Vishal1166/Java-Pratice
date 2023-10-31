
public class Maruti implements Automobile {

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return "Maruti";
	}

	@Override
	public String getcolor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 750000;
	}

	@Override
	public String toString() {
		return "\nModel : " + getname() + "\nColor :" + getcolor() + "\n Price :" + getprice();
	}
	
}
